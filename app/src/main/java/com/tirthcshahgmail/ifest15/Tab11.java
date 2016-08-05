package com.tirthcshahgmail.ifest15;

/**
 * Created by sneh on 24/9/15.
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab11 extends Fragment {
    /*static String[] Value = {"NULL",
            "Do you think you can code with your eyes closed...??  Blind C is the right place where you can challenge yourself that whether you can code without seeing i.e. with computer screen off and test your perfection in coding. Push yourself up, participate in event and show the world how perfect you are!",
            "Do you get a great idea in your mind and wish there had been an app for it? Are you among code junkies who are up to the challenge of making the most awesome apps.  All the enthusiasts with great ideas or app developers, i.App is for you!\n                The event will have two categories.               \n 1) Teams with complete working app compete.        \n 2) Teams with an Idea and a Basic Prototype will compete." ,
            "i.Biz is a business planning event organised to promote the entrepreneurial skills in young minds. Frame your idea into a proper business plan and send us. Don’t let the chance of winning luring prizes run away.        \nThe competition is divided into two categories :        \n1) SOCIAL ENTREPRENEURSHIP  - Business plans that are not only profitable but also would have a prominent social impact.        \n 2) COMMERCIAL ENTREPRENEURSHIP - It involves the submission of regular profitable business ideas. ",
            "i.Bot provides you a wonderful opportunity to build an autonomous bot to fulfil a problem statement and dive into the world of robotics.        \n The competition is divided into two segments :        \n 1) Line follower Bot        \n 2) Robo Race",
            "Here’s where the programming enthusiasts gets to showcase their skills on the geek-o-meter. Join the coding revolution!",
            "Like solving coded messages? Decrypting an encrypted message? This is the event for you. Exercise your brain and show your logic and problem solving capabilities, by solving some fun questions specifically designed to challenge them.",
            "From Facebook to Krogers to your mobile phones, databases are everywhere! Here’s your chance to model real life situations and re-envision database design and win exiting prizes. From the nitty gritties of the trivialest relationships, to the largest tables, design your way through the given scenarios and show your design skill.",
            "Do you get amused while playing with Electronics? If yes, then this is a golden opportunity for you to unleash your talent. If not, then also it's an awe-inspiring platform to have fun.",
            "For math geeks who love walking through numbers, this is an event where mathematical skills stand out. Come show us your mathematical instinct.",
            "NULL",
            "Are you interested in research? Here is an event which provides you an opportunity to pen down your creative research work based on the domain provided. So, start thinking and pen down your ideas.",
            "Always looking to capture moments and make beauty last forever? Are you an amateur photographer or a photography enthusiast? Do you understand the craft of taking pictures, documenting a story, conceptualizing an idea and capturing emotions? If so, then this is the competition for you!",
            "Do you get an adrenaline rush while playing games? Then this event is what you've been waiting for! Bringing you the gaming experience of Counterstrike, Dota and NFS for the first time in i.Fest.",
            "Passionate about solving Rubik's Cube ? Think you're fast enough to beat others in speedcubing ? So here's your chance to show your skills.",
            "If visual clues and neuron twisting questions lead to a sudden surge of impulses in your cerebral cortex, then you are at the right place. Do your best to find the elusive link and fill in the tantalizing blanks. Visual questions are to be decoded and connected to move towards the next sequence.",
            "Love solving crossword puzzles? Challenge your mind to the mysterious world of puzzles through i.Maze.",
            "The hunger for quizzes is truly satisfied by i.Quiz, a tech based quiz featuring mindboggling questions for all the quizzing enthusiasts.",
            "One man's trash is another man's treasure. Make simple yet stunning things from turning trash and junkyard garbage into seriously entertaining, well-designed toys, by just using basic principles of science.",
            "NULL",
            "A secret treasure expedition will be conducted within the territory of DAIICT. What danger may lie in your path? Dare to unveil the forbidden treasures that lie within the shadows. A complete fun-filled event where the students hunt for various 'treasures' around the campus."
    };*/

    static String[][] Value={
            {
                    "If visual clues and neuron twisting questions lead to a sudden surge of impulses in your cerebral cortex, then you are at the right place. Do your best to find the elusive link and fill in the tantalizing blanks. Visual questions are to be decoded and connected to move towards the next sequence.",
                    "Different electronic and mechanical stuff made from Arduino is presented here in the form of an exhibition.",
                    "Here’s where the programming enthusiasts gets to showcase their skills on the geek-o-meter. Join the coding revolution!"
            },{
            "Do you think you can code with your eyes closed...?? \n" +
                    "Blind C is the right place where you can challenge yourself that whether you can code without seeing i.e. with computer screen off and test your perfection in coding. " +
                    "Push yourself up, participate in event and show the world how perfect you are!",
            "Are you interested in research? Here is an event which provides you an opportunity to pen down your creative research work based on the domain provided. So, start thinking and pen down your ideas.",
"The opening ceremony of the technical festival of Da-iict i.Fest'15, led by distinguished speakers from across India.",
            "For math geeks who love walking through numbers, this is an event where mathematical skills stand out. Come show us your mathematical instinct.",


    },
            {
                    "i.Bot provides you a wonderful opportunity to build an autonomous bot to fulfil a problem statement and dive into the world of robotics.\n" +
                            "The competition is divided into two segments :\n" +
                            "1) Line follower Bot\n" +
                            "2) Robo Race \n",
                    "Do you get a great idea in your mind and wish there had been an\n" +
                            "app for it? Are you among code junkies who are up to the challenge of making the most awesome apps.\n" +
                            " All the enthusiasts with great ideas or app developers, i.App is for you!\n" +
                            "The event will have two categories.\n" +
                            "\n" +
                            "Category 1. Teams with complete working app compete.\n" +
                            "Category 2. Teams with an Idea and a Basic Prototype will compete.",
                    "i.Biz is a business planning event organised to promote the entrepreneurial skills in young minds. Frame your idea into a proper business plan and send us. Don’t let the chance of winning luring prizes run away. \n" +
                            "CATEGORIES OF THE COMPETITION:\n" +
                            "\n" +
                            " A. SOCIAL ENTREPRENEURSHIP  - Business plans that are not only profitable but also would have a prominent social impact.\n" +
                            "B. COMMERCIAL ENTREPRENEURSHIP - It involves the submission of regular profitable business ideas. \n",
                    "From Facebook to Krogers to your mobile phones, databases are everywhere! Here’s your chance to model real life situations and re-envision database design and win exiting prizes. From the nitty gritties of the trivialest relationships, to the largest tables, design your way through the given scenarios and show your design skill.\n",
                    "Do you get amused while playing with Electronics? If yes, then this is a golden opportunity for you to unleash your talent. If not, then also it's an awe-inspiring platform to have fun.",
                    "A secret treasure expedition will be conducted within the territory of DAIICT. What danger may lie in your path? Dare to unveil the forbidden treasures that lie within the shadows. A complete fun-filled event where the students hunt for various \"treasures” around the campus.",
                    "Love solving crossword puzzles? Challenge your mind to the mysterious world of puzzles through i.Maze.\n",
                    "Passionate about solving Rubik's Cube ? Think you're fast enough to beat others in speedcubing ? \n" +
                            "So here's your chance to show your skills.\n",
                    "Do you love robo wars? Do you love coding? Excited for Artificial Intelligene ?\n" +
                            "\n" +
                            "Then this is the best platform for all the A.I. lovers to show off their skills. i.Fest’15 is bringing in the first ever contest on Artificial Intelligence. Build the best strategy and the win the war against your rivals and show how intelligent your artificial bot is and so is you… "
            },


            { "i.Bot provides you a wonderful opportunity to build an autonomous bot to fulfil a problem statement and dive into the world of robotics.\n" +
            "The competition is divided into two segments :\n" +
            "1) Line follower Bot\n" +
            "2) Robo Race \n",
            "Do you get a great idea in your mind and wish there had been an\n" +
                    "app for it? Are you among code junkies who are up to the challenge of making the most awesome apps.\n" +
                    " All the enthusiasts with great ideas or app developers, i.App is for you!\n" +
                    "The event will have two categories.\n" +
                    "\n" +
                    "Category 1. Teams with complete working app compete.\n" +
                    "Category 2. Teams with an Idea and a Basic Prototype will compete.",
            "From Facebook to Krogers to your mobile phones, databases are everywhere! Here’s your chance to model real life situations and re-envision database design and win exiting prizes. From the nitty gritties of the trivialest relationships, to the largest tables, design your way through the given scenarios and show your design skill.\n",
            "Do you get amused while playing with Electronics? If yes, then this is a golden opportunity for you to unleash your talent. If not, then also it's an awe-inspiring platform to have fun.",

            "Like solving coded messages? Decrypting an encrypted message? This is the event for you. Exercise your brain and show your logic and problem solving capabilities, by solving some fun questions specifically designed to challenge them.",
                    "The hunger for quizzes is truly satisfied by i.Quiz, a tech based quiz featuring mindboggling questions for all the quizzing enthusiasts.",
            "One man's trash is another man's treasure. Make simple yet stunning things from turning trash and junkyard garbage into seriously entertaining, well-designed toys, by just using basic principles of science.\n",
       "A magnificent ending to a perfect fest.","Dance away to the music because all it takes is one song to bring back thousand memories!!"
            }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_11,container,false);

        TextView descri = (TextView) v.findViewById(R.id.textView);

        Bundle extras = getActivity().getIntent().getExtras();
        int event_no = extras.getInt("Event_no");
        int tab= extras.getInt("Tab");


        String[][] Links = {{},{"<a href=\"http://en.tekstenuitleg.net/articles/software/database-design-tutorial/intro.html\">Database Design</a>",
                "<a href=\"http://www.dreamincode.net/forums/topic/179103-relational-database-design-normalization\">Database Normalization</a>"},{}};

        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/animeace2_reg.otf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/ArchivoBlack-Regular.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Blokletters-Balpen.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Blokletters-Potlood.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/DJB_Stinky_Marker.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/LANENAR_.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/pier-regular.otf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival_Bold.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival_Bold_Italic.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival_Extended.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Cartoonist_Hand.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Cartoonist_Hand_SC.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Smart_Kid.otf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "Roboto-Regular.ttf");

        /*JustifiedTextView jtv= new JustifiedTextView(v.getContext(), "From Facebook to Krogers to your mobile phones, databases are everywhere! Here’s your chance to model real life situations and re-envision database design. From the nitty gritties of the trivialest relationships, to the largest tables, design your way through the given scenarios.");
        LinearLayout place = (LinearLayout) v.findViewById(R.id.ll);
        place.addView(jtv);*/

        //descri.setMovementMethod(LinkMovementMethod.getInstance());
        //descri.setTypeface(face);
        descri.setText(Value[tab][event_no]+"\n\n\n\n\n\n\n\n\n\n\n");

        /*int link_no = Links[event_no].length;
        if(link_no != 0){
            for(int i=0; i<link_no; i++) {
                descri.append("\n");
                descri.append(Html.fromHtml(Links[event_no][i]));
            }
        }*/

        return v;
    }

}