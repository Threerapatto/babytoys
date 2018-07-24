package controllers;

import play.*;
import play.mvc.*;

import scala.reflect.internal.Trees;
import views.Babyproducts;
import views.html.*;

import javax.swing.text.html.HTML;

public class Application extends Controller {


    public static Result hearder_page() {
        return ok(header_page.render());
}}



