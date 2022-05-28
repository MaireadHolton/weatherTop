/**
 * Class to display the about page of the app
 *
 * @author Mairead Holton
 * @version 1
 */

package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;

public class About extends Controller
{
  public static void index() {
    Logger.info("Rendering about");
    render ("about.html");
  }
}
