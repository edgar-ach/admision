package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

<<<<<<< HEAD


=======
import models.*;
@With(Secure.class)
>>>>>>> 561d0f486e966f3dff923ccc055201da5cebeacd
public class Application extends Controller {

    public static void index() {
        render();
    }

}