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

    //PROFILE DATA
    void saveProfileData(String firstName, String lastName, String grade, String classSpecification);
    void saveProfilePicture(); //What should this function get as parameter?? A Bitmap or Bytecode or else ?
    void saveProfileDataObj(ProfileData profileData);
    ProfileData getProfileDataObj();
    //__________________________________________________________________________________________________________________

    //SETTING
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
    //__________________________________________________________________________________________________________________


    //SCHEDULE
    
    //__________________________________________________________________________________________________________________

    //GROUPING
    /**A ClassGroup should maintain several LessonGroups,
     * like every student has its own ClassGroup, but this ClassGroup should still have members(other students).
     * In this ClassGroup are LessonGroups like german, english, math and so on.
     * If something is shared in a LessonGroup, then the ClassGroup should know!
     * If something is shared in a ClassGroup, then it should not affect the LessonGroups,
     * because the ClassGroup should be a super class and the LessonGroups should be sub class of the super class.
     */
    //Factory ?? ClassGroup is a Factory of LessonGroups ?
    //Static Factory !? Tests with one client could be problematic
    ClassGroup createClassGroup(String className);
    LessonGroup createLessonGroup(String lessonName, String lessonTime, String lessonPlace);
    List<LessonGroup> getAllLessonGroups();


    //LessonGroup
    String getLessonName();
    void setLessonName(String lessonName);
    String getLessonTime();
    void setLessonTime(String lessonTime);
    String getLessonPlace();
    void setLessonPlace(String lessonPlace);
    void destroyLessonGroup();
    //void addContentToLessonGroup(String title, String type, Byte imagesAndDocuments);
    //Byte getContentFromLessonGroup(String title, String type);
    //How does a Peer look at application surface ?
    void addMemberToLessonGroup(String somePeer);
    void deleteMemberFromLessonGroup(String somePeer);
    List<String> showAllMembersOfTheLessonGroup();
    void createChatForLessonGroup();
    void addLessonEventToLessonGroup(String lessonEventName, LessonEvent lessonEvent);
    LessonEvent getLessonEventFromLessonGroup(String lessonEventName);
    List<LessonEvent> getAllLessonEventsFromLessonGroup();
    void deleteLessonEventFromLessonGroup(String lessonEventName);
    void shareLessonEventToMembers(String lessonEventName);
    //__________________________________________________________________________________________________________________

    //LESSON-EVENT Interface or Abstract Class?<-- Homework, Test, Exam, Other
    void addDescriptioin(String description);
    String getDescriptioin();
    /*Multiple addContent() functions ? Does this make sense or only one addContent() function ?
    where should this addContent function be ?*/
    void addContent(String title, String type, Byte imagesAndDocuments);
    Byte getContent(String title, String type);
    void addFeedBack(String feedBackDescription);
    List<String> showAllFeedBacks();
    //0 == not helpful, 1 == partly helpful, 2 good/helpful
    void addEvaluation(Integer evaluationNumber);
    List<Integer> getEvaluations();
    Double calculateEvaluation();

    //__________________________________________________________________________________________________________________

    //HOMEWORK implements LessonEvent
    //with owner or without ??
    Homework createHomework(String owner, String name, String lessonName, String deadline);
    Homework createHomework(String owner, String name, String lessonName, String deadline, String description);
    //__________________________________________________________________________________________________________________

    //TEST implements LessonEvent
    Test createTest(String owner, String testName, String deadline);

    //__________________________________________________________________________________________________________________

    //Exam

    //__________________________________________________________________________________________________________________

    //Other

    //__________________________________________________________________________________________________________________
}