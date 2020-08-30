package example.technerd.com.carowner;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<CoK> coKS;
    @Override
    public void onCreate() {
        super.onCreate();


        coKS =new ArrayList<CoK>();
        coKS.add(new CoK("Preamble","Intoduction To Constitution","","file:///android_asset/preamble.html"));
        coKS.add(new CoK(    "Chapter 1",      "SOVEREIGNTY OF THE PEOPLE AND\n" +
                "SUPREMACY OF THIS CONSTITUTION", "chapter01","file:///android_asset/chapter1.html"));



        coKS.add(new CoK(    "Chapter 2",        "THE REPUBLIC", "chapter02","file:///android_asset/chapter2.html")) ;


        coKS.add(new CoK(    "Chapter 3",          "CITIZENSHIP", "chapter03","file:///android_asset/chapter3.html"));


        coKS.add(new CoK(    "Chapter 4",      "THE BILL OF RIGHTS", "chapter04","file:///android_asset/chapter4.html"));


        coKS.add(new CoK(    "Chapter 5",          "LAND AND ENVIRONMENT", "chapter05","file:///android_asset/chapter5.html"));


        coKS.add(new CoK(    "Chapter 6",        "LEADERSHIP AND INTEGRITY", "chapter06","file:///android_asset/chapter6.html"));


        coKS.add(new CoK(    "Chapter 7",          "REPRESENTATION OF THE PEOPLE", "chapter07","file:///android_asset/chapter7.html") );


        coKS.add(new CoK(    "Chapter 8",      "THE LEGISLATURE","chapter08","file:///android_asset/chapter8.html"));


        coKS.add(new CoK(    "Chapter 9",          "THE EXECUTIVE","chapter09","file:///android_asset/chapter9.html"));

        coKS.add(new CoK(    "Chapter 10",      "JUDICIARY", "chapter10" ,"file:///android_asset/chapter10.html"));


        coKS.add(new CoK(    "Chapter 11",          "DEVOLVED GOVERNMENT", "chapter11","file:///android_asset/chapter11.html"));


        coKS.add(new CoK(    "Chapter 12",        "PUBLIC FINANCE", "chapter12","file:///android_asset/chapter12.html"));

        coKS.add(new CoK(    "Chapter 13",      "THE PUBLIC SERVICE","chapter13","file:///android_asset/chapter13.html"));


        coKS.add(new CoK(    "Chapter 14",          "NATIONAL SECURITY", "chapter14","file:///android_asset/chapter14.html"));


        coKS.add(new CoK(    "Chapter 15",        "COMMISSIONS AND INDEPENDENT\n" +
                "OFFICES", "chapter15","file:///android_asset/chapter15.html"));


        coKS.add(new CoK(    "Chapter 16",          "AMENDMENT OF THIS CONSTITUTION", "chapter16","file:///android_asset/chapter16.html"));


        coKS.add(new CoK(    "Chapter 17",        "GENERAL PROVISIONS", "chapter17","file:///android_asset/chapter17.html"));


        coKS.add(new CoK(    "Chapter 18",  "TRANSITIONAL AND CONSEQUENTIAL PROVISION",    "chapter18","file:///android_asset/chapter18.html"));

        coKS.add(new CoK("FIRST SCHEDULE","COUNTIES",
                 "","file:///android_asset/firstSchedule.html"));
        coKS.add(new CoK("SECOND SCHEDULE","NATIONAL SYMBOLS","","file:///android_asset/secondSchedule.html"));

        coKS.add(new CoK("THIRD SCHEDULE","NATIONAL OATHS AND AFFIRMATIONS","","file:///android_asset/thirdSchedule.html"));

        coKS.add(new CoK("FOURTH SCHEDULE","Distribution of Functions Between the National Government and the County Governments","","file:///android_asset/fourthSchedule.html"));
        coKS.add(new CoK("FIFTH SCHEDULE","LEGISLATION TO BE ENACTED BY PARLIAMENT",
                "","file:///android_asset/fithSchedule.html"));

        coKS.add(new CoK("SIXTH SCHEDULE","TRANSITIONAL AND CONSEQUENTIAL PROVISIONS"
                ,"","file:///android_asset/sixSchedule.html"));
        coKS.add(new CoK("SUBSIDIARY LEGISLATION",""
                ,"","file:///android_asset/subLeg.html"));
        coKS.add(new CoK("PUBLIC PROSECUTIONS",""
                ,"","file:///android_asset/Subsidiary.html"));
        coKS.add(new CoK("PROTECTION OF RIGHTS AND\n" +
                "FUNDAMENTAL FREEDOMS)",""
                ,"","file:///android_asset/protectionOfRightAndFundamentalFredoms.html"));
        coKS.add(new CoK("LEGAL FORMS",""
                ,"","file:///android_asset/formA.html"));




    }
}
