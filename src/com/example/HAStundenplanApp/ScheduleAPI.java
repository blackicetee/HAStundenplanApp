package com.example.HAStundenplanApp;

import java.util.Map;

/**
 * Create a schedule API(Application Programming Interface)!
 * Note all functionalities which are needed for the schedule.
 * Like group building or context upload and so on.
 * Not only define this API, additionally think about what should be a group in a decentral system.
 * Are there administrators in this system and who knows about what in particular?
 *
 * Created by Thilo on 16.06.2016.
 */
public interface ScheduleAPI {
    //Profile Data
    void saveProfileData(String firstName, String lastName, String grade, String classSpecification);
    void saveProfilePicture(); //What should this function get as parameter?? A Bitmap or Bytecode or else ?
    void saveProfileDataObj(ProfileData profileData);
    ProfileData getProfileDataObj();

    //Konfigurations


    //Grouping
    //GroupID String or Integer?
    LessonGroup createLessonGroup(String lessonGroupID, String lessonName, String lessonTime);
    String getLessonGroupID();
    String getLessonName();
    String getLessonTime();
    void addContentToLessonGroup(String title, String type, Byte imagesAndDocuments);
    Byte getContentFromLessonGroup(String title, String type);
    //How does a Peer look at application surface ?
    void addMemberToLessonGroup(String somePeer, String addressOfSomePeer);
    void deleteMemberFromLessonGroup(String somePeer);
    Map<String, String> showAllMembersOfTheLessonGroup();
    void createChatForLessonGroup();
    void addHomeworkToLessonGroup(String ID, Homework homework);
    Homework getHomeworkFromLessonGroup(String ID);
    void deleteHomeworkFromLessonGroup(String ID);

    //Homework
    Homework createHomework(String owner, String topicDescription);
    /*Multiple addContent() functions ? Does this make sense or only one addContent() function ?
    where should this addContent function be ?*/
    void addContent();
    void addFeedBack(String writer, String feedBackDescription);
    Map<String, String> showAllFeedBacks();
    //0 == not helpful, 1 == partly helpful, 2 good/helpful
    void evaluateHomework(Integer evaluationNumber);
    Integer getEvaluation();



}