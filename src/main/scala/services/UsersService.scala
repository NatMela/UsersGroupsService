package services

import controller.{JsonSupport, UserWithGroupsDTO, UsersDTO, UsersFromPage, UsersOptionDTO}
import scala.concurrent.{ExecutionContext, Future}
import com.google.inject.Inject
import org.slf4j.LoggerFactory
import spray.json.JsValue
import diffson.sprayJson._
import diffson.lcs.Patience

class UsersService @Inject()() extends JsonSupport {

  lazy val log = LoggerFactory.getLogger(classOf[UsersService])
  implicit val ec = ExecutionContext.global

  implicit val lcs = new Patience[JsValue]

  val maxNumberOfGroups = 16

  def getUsers(): Future[Seq[UsersDTO]] = {
    Future.successful(Seq.empty)
  }


  def getUserById(userId: Int): Future[Option[UsersDTO]] = {
    Future.successful(None)
  }

  def getDetailsForUser(userId: Int): Future[Option[UserWithGroupsDTO]] = {
    Future.successful(None)
  }

  def getUsersFromPage(pageSize: Int, pageNumber: Int): Future[UsersFromPage] = {
    Future.successful(UsersFromPage(Seq.empty, 1000, pageNumber, pageSize))
  }

  def updateUserById(userId: Int, userRow: UsersDTO): Future[Option[UsersDTO]] = {
    Future.successful(None)
  }

  def updateOneFieldOfUserById(userId: Int, userRow: UsersOptionDTO): Future[Option[UsersDTO]] = {
    Future.successful(None)
  }

  def insertUser(user: UsersDTO) = {
    Future.successful(None)
  }

  def addUserToGroup(userId: Int, groupId: Int): Future[String] = {
    Future.successful("Add")
  }

  def deleteUser(userId: Int): Future[Unit] = {
    Future()
  }


  def setUserAsActive(userId: Int) = {
    Future.successful(None)
  }

  def setUserAsNonActive(userId: Int): Future[Option[UsersDTO]] = {
    Future.successful(None)
  }

  def deleteUserFromGroup(userId: Int, groupId: Int): Future[Unit] = {
    Future.successful()
  }
}
