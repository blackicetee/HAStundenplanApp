package com.example.HAStundenplanApp;

import android.os.Parcel;
import android.os.Parcelable;
import net.sharksystem.sharknet.api.Lesson;

/**
 * Created by Thilo on 13.07.2016.
 */
public class ImplLessonParcel implements Parcelable {
    private Lesson lesson = null;

    ImplLessonParcel(Lesson lesson) {
        this.lesson.setLessonName(lesson.getLessonName());
        this.lesson.setAcronym(lesson.getAcronym());
        this.lesson.setColorCode(lesson.getColorCode());
        this.lesson.setContact(lesson.getContact());
        this.lesson.setContactTelephoneNumber(lesson.getContactTelephoneNumber());
        this.lesson.setContactMailAddress(lesson.getContactMailAddress());
        this.lesson.setRoom(lesson.getRoom());
    }

    Lesson getLesson() {
        return lesson;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // write your object's data to the passed-in Parcel
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(lesson.getLessonName());
        dest.writeString(lesson.getAcronym());
        dest.writeInt(lesson.getColorCode());
        dest.writeString(lesson.getContact());
        dest.writeString(lesson.getContactTelephoneNumber());
        dest.writeString(lesson.getContactMailAddress());
        dest.writeString(lesson.getContactTelephoneNumber());
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<ImplLessonParcel> CREATOR = new Parcelable.Creator<ImplLessonParcel>() {
        public ImplLessonParcel createFromParcel(Parcel in) {
            return new ImplLessonParcel(in);
        }

        public ImplLessonParcel[] newArray(int size) {
            return new ImplLessonParcel[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    public ImplLessonParcel(Parcel in) {
        this.lesson.setLessonName(in.readString());
        this.lesson.setAcronym(in.readString());
        this.lesson.setColorCode(in.readInt());
        this.lesson.setContact(in.readString());
        this.lesson.setContactTelephoneNumber(in.readString());
        this.lesson.setContactMailAddress(in.readString());
        this.lesson.setRoom(in.readString());
    }
}
