package com.example.HAStundenplanApp;

import android.os.Parcel;
import android.os.Parcelable;
import net.sharksystem.sharknet.api.Lesson;

/**
 * Created by Thilo on 13.07.2016.
 */

public class ImplLesson implements Lesson, Parcelable {
    private String lessonName = "";
    private String acronym = "";
    private int colorCode = 0;
    private String contact = "";
    private String contactTelephoneNumber = "";
    private String contactMailAddress = "";
    private String room = "";

    ImplLesson() {

    }

    ImplLesson(Lesson lesson) {
        this.lessonName = lesson.getLessonName();
        this.acronym = lesson.getAcronym();
        this.colorCode = lesson.getColorCode();
        this.contact = lesson.getContact();
        this.contactTelephoneNumber = lesson.getContactTelephoneNumber();
        this.contactMailAddress = lesson.getContactMailAddress();
        this.room = lesson.getRoom();
    }

    @Override
    public String getLessonName() {
        return lessonName;
    }

    @Override
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String getAcronym() {
        return acronym;
    }

    @Override
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @Override
    public int getColorCode() {
        return colorCode;
    }

    @Override
    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }


    @Override
    public String getContact() {
        return contact;
    }

    @Override
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String getContactTelephoneNumber() {
        return contactTelephoneNumber;
    }

    @Override
    public void setContactTelephoneNumber(String telephoneNumber) {
        contactTelephoneNumber = telephoneNumber;
    }

    @Override
    public String getContactMailAddress() {
        return contactMailAddress;
    }

    @Override
    public void setContactMailAddress(String mailAddress) {
        contactMailAddress = mailAddress;
    }

    @Override
    public String getRoom() {
        return room;
    }

    @Override
    public void setRoom(String room) {
        this.room = room;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    // write your object's data to the passed-in Parcel
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(lessonName);
        dest.writeString(acronym);
        dest.writeInt(colorCode);
        dest.writeString(contact);
        dest.writeString(contactTelephoneNumber);
        dest.writeString(contactMailAddress);
        dest.writeString(room);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<ImplLesson> CREATOR = new Parcelable.Creator<ImplLesson>() {
        public ImplLesson createFromParcel(Parcel in) {
            return new ImplLesson(in);
        }

        public ImplLesson[] newArray(int size) {
            return new ImplLesson[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    public ImplLesson(Parcel in) {
        lessonName = in.readString();
        acronym = in.readString();
        colorCode = in.readInt();
        contact = in.readString();
        contactTelephoneNumber = in.readString();
        contactMailAddress = in.readString();
        room = in.readString();
    }
}
