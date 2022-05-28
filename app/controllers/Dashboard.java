/**
 * Class to control what is displayed on the dashboard. Including station controls.
 *
 * @author Mairead Holton
 * @version 1
 */
package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Member;
import models.Station;
import models.Reading;
import org.eclipse.jdt.core.IMember;
import play.Logger;
import play.db.jpa.JPABase;
import play.mvc.Controller;

public class Dashboard extends Controller
{
  //Method to display all stations on the dashboard
  public static void index()
  {
    Logger.info("Rendering Admin");
    Member member = Accounts.getLoggedInMember();
    List<Station> stations = Station.findAll();
    render ("dashboard.html", stations);
  }

  //Version 5: Method to delete a station
  public static void deleteStation (Long id)
  {
    Station station = Station.findById(id);
    Member member = Accounts.getLoggedInMember();
    member.stations.remove(station);
    Logger.info ("Removing" + station.name);
    member.save();
    station.delete();
    redirect ("/dashboard");
  }

  //Version 3: Method to add a new station
  public static void addStation(String name)
  {
    Station station = new Station (name, 0,0,0, 0,0,0,0);
    Logger.info ("Adding a new station called " + name);
    Member member = Accounts.getLoggedInMember();
    member.stations.add(station);
    member.save();
    station.save();
    redirect ("/dashboard");
  }
}
