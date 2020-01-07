package services

import controller.{GroupWithUsersDTO, GroupsDTO, GroupsFromPage, GroupsOptionDTO}

import scala.concurrent.{ExecutionContext, Future}
import com.google.inject.Inject
import org.slf4j.LoggerFactory

class GroupsService @Inject()() {

  lazy val log = LoggerFactory.getLogger(classOf[GroupsService])
  implicit val ec = ExecutionContext.global

  val maxGroupNumber = 16

  def getGroups: Future[Seq[GroupsDTO]] = {
    Future.successful(Seq.empty)
  }

  def getGroupsFromPage(pageSize: Int, pageNumber: Int): Future[GroupsFromPage] = {
    Future.successful(GroupsFromPage(Seq.empty, 65, pageNumber, pageSize))
  }

  def getGroupById(groupId: Int): Future[Option[GroupsDTO]] = {
    Future.successful(None)
  }

  def getGroupsByIds(groupsId: Seq[Int]): Future[Seq[GroupsDTO]] = {
    Future.successful(Seq.empty)
  }

  def getDetailsForGroup(groupId: Int): Future[Option[GroupWithUsersDTO]] = {
    Future.successful(None)
  }

  def updateGroupById(groupId: Int, groupRow: GroupsDTO): Future[Option[GroupsDTO]] = {
    Future.successful(None)
  }

  def updateOneFieldOfGroupById(groupId: Int, valueToUpdate: GroupsOptionDTO): Future[Option[GroupsDTO]] = {
    Future.successful(None)
  }

  def insertGroup(group: GroupsDTO): Future[Option[GroupsDTO]] = {
    Future.successful(None)
  }

  def addGroupToUser(userId: Int, groupId: Int): Future[String] = {
    Future.successful("Add")
  }

  def deleteGroup(groupId: Int): Future[Unit] = {
    Future.successful()
  }

  def deleteGroupForUser(userId: Int, groupId: Int): Future[Unit] = {
    Future()
  }
}