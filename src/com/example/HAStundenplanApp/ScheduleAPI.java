package com.example.HAStundenplanApp;


import java.util.List;

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
    void addContentToLessonGroup(Byte imagesAndDocuments);
    Byte getContentFromLessonGroup(/*some specifications?? like ints or IDs?*/);
    //How does a Peer look at application surface ?
    void addMemberToLessonGroup(String somePeer);
    void deleteMemberFromLessonGroup(String somePeer);
    List<String> showAllMembersOfTheLessonGroup();
    void createChatForLessonGroup();
    void addHomework(Homework homework);

    //Homework
    Homework createHomework(String owner, String topicDescription);




}