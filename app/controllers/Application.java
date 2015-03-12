package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.About;
import views.html.Aukahi;
import views.html.Index;
import views.html.KamanuV6;
import views.html.Pueo;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {

    return ok(Index.render());
  }

  /**
   * Returns the Pueo page.
   * @return The resulting Pueo page.
   */
  public static Result Pueo() {

    return ok(Pueo.render());
  }
  /**
   * Returns the Aukahi page.
   * @return The resulting Aukahi page.
   */
  public static Result Aukahi() {

    return ok(Aukahi.render());
  }
  /**
   * Returns the KamanuV6 page.
   * @return The resulting KamanuV6 page.
   */
  public static Result KamanuV6() {

    return ok(KamanuV6.render());
  }
  /**
   * Returns the About page.
   * @return The resulting About page.
   */
  public static Result About() {

    return ok(About.render());
  }

}
