package com.example.crossfit;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

public class MyDatabase extends SQLiteOpenHelper {
    final static String DATABASE_NAME = "dbCross";
    final static int DATABASE_VERSION = 4;

    final static String TABLE_ABOUT = "tbabout";
    final static String TABLE_CHEST = "chest";
    final static String TABLE_ABS = "abs";
    final static String TABLE_BICEPS = "biceps";
    final static String TABLE_SHOULDERS = "shoulder";
    final static String TABLE_CARDIO = "cardio";
    ArrayList<ChestData> chest = new ArrayList<>();
    ChestData ch;
    final static String COLUMN1_CROSSFIT = "crossfit";
    final static String COLUMN2_CROSSFITPURPOSE = "crossfitpurpose";

    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_ABOUT + " ( " + COLUMN1_CROSSFIT + " TEXT, " +
                COLUMN2_CROSSFITPURPOSE + " TEXT)";
        String CREATE_TABLE_CHEST = "CREATE TABLE " + TABLE_CHEST + " (Name Text,Description Text,Image Text )";
        String CREATE_TABLE_ABS = "CREATE TABLE " + TABLE_ABS + " (Name Text,Description Text,Image Text )";
        String CREATE_TABLE_BICEPS = "CREATE TABLE " + TABLE_BICEPS + " (Name Text,Description Text,Image Text )";
        String CREATE_TABLE_SHOULDERS = "CREATE TABLE " + TABLE_SHOULDERS + " (Name Text,Description Text,Image Text )";
        String CREATE_TABLE_CARDIO = "CREATE TABLE " + TABLE_CARDIO + " (Name Text,Description Text,Image Text )";
        db.execSQL(CREATE_TABLE_CARDIO);
        db.execSQL(CREATE_TABLE_SHOULDERS);
        db.execSQL(CREATE_TABLE_BICEPS);
        db.execSQL(CREATE_TABLE_CHEST);
        db.execSQL(CREATE_TABLE);
        db.execSQL(CREATE_TABLE_ABS);

        //fill database
        db.execSQL("Insert into " + TABLE_ABOUT + " VALUES('CrossFit borrows movements from a variety of sports including, gymnastics, weightlifting, powerlifting, and rowing. It was created by former gymnast Greg Glassman to maximize the amount of work performed in the shortest amount of time, according to the official CrossFit website, which serves as the activity governing and branding entity.\n" +
                "\n" +
                "The goal of CrossFit is to boost your fitness and help you move better, whether it during a hockey game or hoisting heavy bags at the grocery store. This is achieved by performing a bunch of functional movements at high intensity,',  'Typically, each class is broken up into three parts: the warmup, skill or strength component, then the workout of the day, or WOD.\n" +
                "\n" +
                "The warmup is tailored to the skill or strength component, so you prepped for what comes next. Skilled workouts are designed to improve your ability to do certain exercises, like the jumprope double-under, while Strength workouts aim to make you well, stronger.\n" +
                "\n" +
                "The final part of the class is the WOD, which asks you to perform a specific set of exercises in a given amount of time or rep scheme. WODs are usually total body workouts that range from 8 to 16 minutes, but can be as short as three, Creighton explains.\n" +
                "\n" +
                "\"A three-minute workout sounds silly, but when you put the intensity at 95 percent, you’re going to be recovering for an hour after that,\" he says.\n" +
                "\n" +
                "Many gyms create their own WODs, but CrossFit does have a slew of benchmark workouts named after women; Fran is one popular one, which consists of thrusters and pullups. There are also Hero WODs named after fallen service men and women.')");
        //CHEST WORKOUT
        db.execSQL("INSERT INTO " + TABLE_CHEST + " VALUES('BENCH PRESS','The bench press is an upper-body weight training exercise in which the trainee presses a weight upwards while lying on a weight training bench. The exercise uses the pectoralis major, the anterior deltoids, and the triceps, among other stabilizing muscles. A barbell is generally used to hold the weight, but a pair of dumbbells can also be used','benchpress')," +
                "('DUMBBELL FLYS','The chest fly or pectoral fly (abbreviated to pec fly) primarily works the pectoralis major muscles to move the arms horizontally forward. If medially (internally) rotated, it is assisted in this by the anterior (front) head of the deltoideus in transverse flexion. If laterally (externally) rotated, the contribution of the deltoid is lessened and the pec major is strongly emphasized as the transverse adductor.','dumbbellflys')," +
                "('PUSH UPS','A push-up (or press-up) is a common calisthenics exercise beginning from the prone position, or the front leaning rest position known in the military. By raising and lowering the body using the arms, push-ups exercise the pectoral muscles, triceps, and anterior deltoids, with ancillary benefits to the rest of the deltoids, serratus anterior, coracobrachialis and the midsection as a whole','pushups')," +
                "('DUMBBELL PULLOVER',' The dumbbell or db pullover is a staple in many split routines and bodybuilding workouts because its one exercise that hits many muscles. Some training plans include it as part of a push/pull day, while others add it to a single body part day such as chest day.','dumbbellpullover')," +
                "('INCLINE PRESS','The bench press is an upper-body weight training exercise in which the trainee presses a weight upwards while lying on a weight training bench. The exercise uses the pectoralis major, the anterior deltoids, and the triceps, among other stabilizing muscles. A barbell is generally used to hold the weight, but a pair of dumbbells can also be used','inclinepress')");
        //ABS WORKOUT
        db.execSQL("INSERT INTO " + TABLE_ABS + " VALUES('CRUNCHES','A crunch begins with lying face up on the floor with knees bent and feet planted on the ground. The movement begins by curling the shoulders towards the pelvis. The hands can be behind or beside the neck or crossed over the chest. Injury can be caused by pushing against the head or neck with hands.','crunch')," +
                "('LEG RAISES','The leg raise is a strength training exercise which targets the iliopsoas. Because the abdominal muscles are used isometrically to stabilize the body during the motion, leg raises are also often used to strengthen the rectus abdominis muscle and the internal and external oblique muscles','legraise')," +
                "('PLANK','The plank is an isometric core strength exercise that involves maintaining a position similar to a push-up for the maximum possible time The plank is a core strengthening exercise that works the transversus abdominis muscle.','plank')," +
                "('TWIST CRUNCH','Lie on the floor or a mat on your back, with knees bent and hands behind head. Feet should be flat on the ground. Keep a space between your chin and chest (looking diagonal towards the ceiling). ','twistcrunch')," +
                "('JACK KNIFE','Jack knife sit ups are a great low-impact exercise for strengthening abdominal muscles. They are a great way to tighten the lower abs and help you get six pack abs. Jack knife sit ups will give your abs challenging workout, but the basics are easy to master!','jackknife')");
        //BICEPS WORKOUT
        db.execSQL("INSERT INTO " + TABLE_BICEPS + " VALUES('BARBELL BICEP','A barbell curl is a pull-type, isolation exercise which works primarily your biceps, but also trains muscles in your forearms and shoulders to some degree, as well.Perform one to three sets for 12 to 20 repetitions to improve muscular endurance. ','barbellcurl')," +
                "('BARBELL PREACHER CURL','The barbell preacher curl is a great exercise to isolate the biceps. Adjust the seat on the preacher bench so that your upper arms sit comfortably on the padding when seated.Sit on the preacher bench and grip the barbell with your hands shoulder width apart using an underhand (palms facing up) grip.','barbellpreacher')," +
                "('BARBELL CONCENTRATION CURL','The barbell concentration curl is a great exercise for isolating the biceps. Grab a flat bench and sit the barbell you want to use at one end (you can also use an EZ bar).Sit on the end of the bench with your feet slightly wider than should width apart.','barbellconcen')," +
                "('BARBELL CURL','Before you pick up a weight, stand with your arms at your sides and palms facing out. Your hands will be wider than shoulder width. That should be the strongest and most joint-friendly grip for you.Now load a barbell, either on the floor or, if you’re training at home or in a mostly empty gym, the supports of a squat rack.','barbellcurl')," +
                "('CABEL BICEPS CURL','Standing Biceps Cable Curl Instructions. Stand up with your torso upright while holding a cable curl bar that is attached to a low pulley. Grab the cable bar at shoulder width and keep the elbows close to the torso. The palm of your hands should be facing up (supinated grip). This will be your starting position.','bicepscurl')");
        //SHOULDERS WORKOUT
        db.execSQL("INSERT INTO " + TABLE_SHOULDERS + " VALUES('SHOULDER PRESS','The Overhead Press is a full body, compound exercise. Your shoulders and arms press the weight over your head while your legs, lower back and abs balance you. The Overhead Press is one of the best exercises to build strong, muscular and healthy shoulders with bigger arms To avoid shoulder pain, Overhead Press with a narrow grip so you don’t flare your elbows','shoulderpress')," +
                "('FRONT RAISE','The front raise is a weight training exercise. This exercise is an isolation exercise which isolates shoulder flexion. It primarily works the anterior deltoid, with assistance from the serratus anterior, biceps brachii and clavicular portions of the pectoralis major.','frontraise')," +
                "('LATERAL RAISE ','The result is a move that looks like a Lateral Raise, but is more likely to cause shoulder pain and scare people away from the exercise. But if done correctly, its a safe and effective way to develop your shoulders.The prime movers in dumbbell lateral raises are your shoulders, or the deltoids.','lateralraise')," +
                "('SHOULDER SHRUG','The lifter stands erect, hands about shoulder width apart, and raises the shoulders as high as possible, and then lowers them, while not bending the elbows, or moving the body at all. The lifter may not have as large a range of motion as in a normal shrug done for active flexibility. It is usually considered good form if the slope of the shoulders is horizontal in the elevated position.','shouldershrug')," +
                "('BACK PRESS','beyond shoulder width. Keeping your lower back naturally arched, pull your torso up and thrust your hips forward as you stand up with the barbell. Lower the bar to the floor and repeat Building up your back is more beneficial than just checking off another box on your full body schedule.','backpress')");
        //CARDIO WORKOUT
        db.execSQL("INSERT INTO " + TABLE_CARDIO + " VALUES('BURPEE','The burpee, or squat thrust, is a full body exercise used in strength training and as an aerobic exercise. The basic movement is performed in four steps and known as a \"four-count burpee\": Begin in a standing position. Move into a squat position with your hands on the ground.The burpee is the ultimate full-body exercise','burpee')," +
                "('JUMPING SQUAT','ump squats help tone the calves, glutes, hamstrings, core, and quadriceps. Lift a pair of dumbbells and keep at the sides, with the knuckles facing away from your body. Lower your body as much as you can by squatting down. Bend your knees and assume the position of sitting down','jumpingsquats')," +
                "('HIGH KNESS','Knee highs are hosiery that cover the feet and legs up to the knee. A fashion accessory for a casual and classic cool or warm weather apparel. Typically worn by women in many societies, they are sometimes worn with modern semi-formal attire.','highkness')," +
                "('MOUNTAIN CLIMBER','Mountain Climbers are a killer exercise that get your heart rate up fast while also firing nearly every muscle group in the body—deltoids, biceps, triceps, chest, obliques, abdominals, quads, hamstrings and hip abductors','mountainclimber')," +
                "('HALF BURPEE','To do Half Burpees, set up in the high plank position with your hands under your shoulders and your feet about shoulder-width apart. Then jump both feet up and outside your hands so your in a squat position. Try to really jump all the way outside your hands. Quickly jump back into plank.','halfburpee')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table " + TABLE_ABOUT);
        db.execSQL("drop table " + TABLE_CHEST);
        db.execSQL("drop table " + TABLE_ABS);
        db.execSQL("drop table " + TABLE_BICEPS);
        db.execSQL("drop table " + TABLE_SHOULDERS);
        db.execSQL("drop table " + TABLE_CARDIO);
        onCreate(db);
    }


    public ArrayList<String> getAboutUs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select " + COLUMN1_CROSSFIT + " FROM " + TABLE_ABOUT, null);
        ArrayList<String> data = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                data.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        return data;

    }

   /* public ArrayList<Person> loadd(){


                SQLiteDatabase db = this.getReadableDatabase();
                String[] columns = {COLUMN1_CROSSFIT,COLUMN2_CROSSFITPURPOSE};

                Cursor cursor = db.query(TABLE_ABOUT,columns,null,null,null,null,null);
                cursor.moveToFirst();
                person.setCrossfit(cursor.getString(cursor.getColumnIndex("COLUMN1_CROSSFIT")));
                person.setCrossfitpurpose(cursor.getString(cursor.getColumnIndex("COLUMN2_CROSSFITPURPOSE")));
                persons.add(person);
                return persons;
    }*/


    public ArrayList<String> getAboutUsPurpose() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select " + COLUMN2_CROSSFITPURPOSE + " FROM " + TABLE_ABOUT, null);
        ArrayList<String> data = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                data.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        return data;

    }

    //function used to get values from database
    public ArrayList<ChestData> getResults() {

        /*SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("Select *  FROM " + TABLE_CHEST, null); //function to retrieve all values from a table- written in MyDb.java file
        if (c.moveToFirst()) {
            do {
                String name = c.getString(c.getColumnIndex("Name"));
                String description = c.getString(c.getColumnIndex("Description"));
                String image = c.getString(c.getColumnIndex("Image"));
                try {

                    ch.setName(name);
                    ch.setDescription(description);
                    ch.setImage(image);
                    chest.add(ch);
                } catch (Exception e) {

                }

            } while (c.moveToNext());
        }
        db.close();
        return chest;*/

        ArrayList<ChestData> chest = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String[] field = {"Name", "Description", "Image"};
        Cursor c = db.query(TABLE_CHEST, field, null, null, null, null, null);

        int iname = c.getColumnIndex("Name");
        int ides = c.getColumnIndex("Description");
        int image = c.getColumnIndex("Image");


        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            String name = c.getString(iname);
            String des = c.getString(ides);
            String pic = c.getString(image);
            chest.add(new ChestData(name, des, pic));

        }

        return chest;

    }
    public ArrayList<AbsData> getabsResults() {



        ArrayList<AbsData> abs = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String[] field = {"Name", "Description", "Image"};
        Cursor c = db.query(TABLE_ABS, field, null, null, null, null, null);

        int iname = c.getColumnIndex("Name");
        int ides = c.getColumnIndex("Description");
        int image = c.getColumnIndex("Image");


        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            String name = c.getString(iname);
            String des = c.getString(ides);
            String pic = c.getString(image);
            abs.add(new AbsData(name, des, pic));

        }

        return abs;

    }
    public ArrayList<BicepsData> getbicepsResults() {



        ArrayList<BicepsData> biceps = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String[] field = {"Name", "Description", "Image"};
        Cursor c = db.query(TABLE_BICEPS, field, null, null, null, null, null);

        int iname = c.getColumnIndex("Name");
        int ides = c.getColumnIndex("Description");
        int image = c.getColumnIndex("Image");


        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            String name = c.getString(iname);
            String des = c.getString(ides);
            String pic = c.getString(image);
            biceps.add(new BicepsData(name, des, pic));

        }

        return biceps;

    }
    public ArrayList<ShoulderData> getshoulderResults() {



        ArrayList<ShoulderData> shoulder = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String[] field = {"Name", "Description", "Image"};
        Cursor c = db.query(TABLE_SHOULDERS, field, null, null, null, null, null);

        int iname = c.getColumnIndex("Name");
        int ides = c.getColumnIndex("Description");
        int image = c.getColumnIndex("Image");


        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            String name = c.getString(iname);
            String des = c.getString(ides);
            String pic = c.getString(image);
            shoulder.add(new ShoulderData(name, des, pic));

        }

        return shoulder;

    }
    public ArrayList<CardioData> getcardioResults() {



        ArrayList<CardioData> cardio = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String[] field = {"Name", "Description", "Image"};
        Cursor c = db.query(TABLE_CARDIO, field, null, null, null, null, null);

        int iname = c.getColumnIndex("Name");
        int ides = c.getColumnIndex("Description");
        int image = c.getColumnIndex("Image");


        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            String name = c.getString(iname);
            String des = c.getString(ides);
            String pic = c.getString(image);
            cardio.add(new CardioData(name, des, pic));

        }

        return cardio;

    }

}
