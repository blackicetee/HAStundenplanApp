package com.example.HAStundenplanApp;

import java.util.List;
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

    //Setting
    //Konfiguration functions have to be verified! e.g. scheduleView just 3 possible inputs = Daily || Weekly || Monthly
    //I could use the Android Preference API = Android Settings
    void setScheduleView(String scheduleView);
    String getScheduleView();
    //Share homework with group || share homework on request || don`t share at all
    void setShareOptions(String shareOptions);
    String getShareOptions();
    //Show homework || show lessons || show tests || show exams || show other
    void setFilterOption(String filterOption);
    String getFilterOtion();
    //Hierarchical group || linear group ??
    void setGroupOptions(String groupOptions);
    String getGroupOptions();


    //Grouping
    //GroupID String or Integer?
    LessonGroup createLessonGroup(String lessonName, String lessonTime);
    String getLessonName();
    String getLessonTime();
    void destroyLessonGroup(String lessonName);
    void addContentToLessonGroup(String title, String type, Byte imagesAndDocuments);
    Byte getContentFromLessonGroup(String title, String type);
    //How does a Peer look at application surface ?
    void addMemberToLessonGroup(String somePeer);
    void deleteMemberFromLessonGroup(String somePeer);
    List<String> showAllMembersOfTheLessonGroup();
    void createChatForLessonGroup(String lessonName);
    void addHomeworkToLessonGroup(String lessonName, String homeworkName, Homework homework);
    Homework getHomeworkFromLessonGroup(String lessonName, String homeworkName);
    List<Homework> getAllHomeworksFromLessonGroup();
    void deleteHomeworkFromLessonGroup(String lessonName, String homeworkName);

    //Homework
    Homework createHomework(String owner, String homeworkName, String lessonName);
    Homework createHomework(String owner, String homeworkName, String lessonName, String homeworkDescription);
    /*Multiple addContent() functions ? Does this make sense or only one addContent() function ?
    where should this addContent function be ?*/
    void addHomeworkDescription(String homeworkDescription);
    String getHomeworkDescriptioin();
    void addContent();
    void addFeedBack(String writer, String feedBackDescription);
    Map<String, String> showAllFeedBacks();
    //0 == not helpful, 1 == partly helpful, 2 good/helpful
    void evaluateHomework(Integer evaluationNumber);
    Integer getEvaluation();

    //Schedule




}