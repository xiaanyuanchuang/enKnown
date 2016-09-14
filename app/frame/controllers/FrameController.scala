package  frame.controllers

import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent.Future

import com.google.inject._

class FrameController @Inject() () extends Controller{
    def getFrame = Action.async {
        request =>
            Future.successful(Ok(""))
    }
}