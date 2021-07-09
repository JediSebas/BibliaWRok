package com.jedisebas.bibliawrok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;
import androidx.room.Room;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WholeProgramActivity extends AppCompatActivity {
//
//    Button img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
//            img11, img12, img13, img14, img15, img16, img17, img18, img19, img20,
//            img21, img22, img23, img24, img25, img26, img27, img28, img29, img30,
//            img31, img32, img33, img34, img35, img36, img37, img38, img39, img40,
//            img41, img42, img43, img44, img45, img46, img47, img48, img49, img50,
//            img51, img52, img53, img54, img55, img56, img57, img58, img59, img60,
//            img61, img62, img63, img64, img65, img66, img67, img68, img69, img70,
//            img71, img72, img73, img74, img75, img76, img77, img78, img79, img80,
//            img81, img82, img83, img84, img85, img86, img87, img88, img89, img90,
//            img91, img92, img93, img94, img95, img96, img97, img98, img99, img100,
//            img101, img102, img103, img104, img105, img106, img107, img108, img109, img110,
//            img111, img112, img113, img114, img115, img116, img117, img118, img119, img120,
//            img121, img122, img123, img124, img125, img126, img127, img128, img129, img130,
//            img131, img132, img133, img134, img135, img136, img137, img138, img139, img140,
//            img141, img142, img143, img144, img145, img146, img147, img148, img149, img150,
//            img151, img152, img153, img154, img155, img156, img157, img158, img159, img160,
//            img161, img162, img163, img164, img165, img166, img167, img168, img169, img170,
//            img171, img172, img173, img174, img175, img176, img177, img178, img179, img180,
//            img181, img182, img183, img184, img185, img186, img187, img188, img189, img190,
//            img191, img192, img193, img194, img195, img196, img197, img198, img199, img200,
//            img201, img202, img203, img204, img205, img206, img207, img208, img209, img210,
//            img211, img212, img213, img214, img215, img216, img217, img218, img219, img220,
//            img221, img222, img223, img224, img225, img226, img227, img228, img229, img230,
//            img231, img232, img233, img234, img235, img236, img237, img238, img239, img240,
//            img241, img242, img243, img244, img245, img246, img247, img248, img249, img250,
//            img251, img252, img253, img254, img255, img256, img257, img258, img259, img260,
//            img261, img262, img263, img264, img265, img266, img267, img268, img269, img270,
//            img271, img272, img273, img274, img275, img276, img277, img278, img279, img280,
//            img281, img282, img283, img284, img285, img286, img287, img288, img289, img290,
//            img291, img292, img293, img294, img295, img296, img297, img298, img299, img300,
//            img301, img302, img303, img304, img305, img306, img307, img308, img309, img310,
//            img311, img312, img313, img314, img315, img316, img317, img318, img319, img320,
//            img321, img322, img323, img324, img325, img326, img327, img328, img329, img330;

    Button[] tab = new Button[331];
    String[] grs = new String[331];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whole_menu);


        tab[1] = findViewById(R.id.imageButton1);
        tab[2] = findViewById(R.id.imageButton2);
        tab[3] = findViewById(R.id.imageButton3);
        tab[4] = findViewById(R.id.imageButton4);
        tab[5] = findViewById(R.id.imageButton5);
        tab[6] = findViewById(R.id.imageButton6);
        tab[7] = findViewById(R.id.imageButton7);
        tab[8] = findViewById(R.id.imageButton8);
        tab[9] = findViewById(R.id.imageButton9);
        tab[10] = findViewById(R.id.imageButton10);
        tab[11] = findViewById(R.id.imageButton11);
        tab[12] = findViewById(R.id.imageButton12);
        tab[13] = findViewById(R.id.imageButton13);
        tab[14] = findViewById(R.id.imageButton14);
        tab[15] = findViewById(R.id.imageButton15);
        tab[16] = findViewById(R.id.imageButton16);
        tab[17] = findViewById(R.id.imageButton17);
        tab[18] = findViewById(R.id.imageButton18);
        tab[19] = findViewById(R.id.imageButton19);
        tab[20] = findViewById(R.id.imageButton20);
        tab[21] = findViewById(R.id.imageButton21);
        tab[22] = findViewById(R.id.imageButton22);
        tab[23] = findViewById(R.id.imageButton23);
        tab[24] = findViewById(R.id.imageButton24);
        tab[25] = findViewById(R.id.imageButton25);
        tab[26] = findViewById(R.id.imageButton26);
        tab[27] = findViewById(R.id.imageButton27);
        tab[28] = findViewById(R.id.imageButton28);
        tab[29] = findViewById(R.id.imageButton29);
        tab[30] = findViewById(R.id.imageButton30);
        tab[31] = findViewById(R.id.imageButton31);
        tab[32] = findViewById(R.id.imageButton32);
        tab[33] = findViewById(R.id.imageButton33);
        tab[34] = findViewById(R.id.imageButton34);
        tab[35] = findViewById(R.id.imageButton35);
        tab[36] = findViewById(R.id.imageButton36);
        tab[37] = findViewById(R.id.imageButton37);
        tab[38] = findViewById(R.id.imageButton38);
        tab[39] = findViewById(R.id.imageButton39);
        tab[40] = findViewById(R.id.imageButton40);
        tab[41] = findViewById(R.id.imageButton41);
        tab[42] = findViewById(R.id.imageButton42);
        tab[43] = findViewById(R.id.imageButton43);
        tab[44] = findViewById(R.id.imageButton44);
        tab[45] = findViewById(R.id.imageButton45);
        tab[46] = findViewById(R.id.imageButton46);
        tab[47] = findViewById(R.id.imageButton47);
        tab[48] = findViewById(R.id.imageButton48);
        tab[49] = findViewById(R.id.imageButton49);
        tab[50] = findViewById(R.id.imageButton50);
        tab[51] = findViewById(R.id.imageButton51);
        tab[52] = findViewById(R.id.imageButton52);
        tab[53] = findViewById(R.id.imageButton53);
        tab[54] = findViewById(R.id.imageButton54);
        tab[55] = findViewById(R.id.imageButton55);
        tab[56] = findViewById(R.id.imageButton56);
        tab[57] = findViewById(R.id.imageButton57);
        tab[58] = findViewById(R.id.imageButton58);
        tab[59] = findViewById(R.id.imageButton59);
        tab[60] = findViewById(R.id.imageButton60);
        tab[61] = findViewById(R.id.imageButton61);
        tab[62] = findViewById(R.id.imageButton62);
        tab[63] = findViewById(R.id.imageButton63);
        tab[64] = findViewById(R.id.imageButton64);
        tab[65] = findViewById(R.id.imageButton65);
        tab[66] = findViewById(R.id.imageButton66);
        tab[67] = findViewById(R.id.imageButton67);
        tab[68] = findViewById(R.id.imageButton68);
        tab[69] = findViewById(R.id.imageButton69);
        tab[70] = findViewById(R.id.imageButton70);
        tab[71] = findViewById(R.id.imageButton71);
        tab[72] = findViewById(R.id.imageButton72);
        tab[73] = findViewById(R.id.imageButton73);
        tab[74] = findViewById(R.id.imageButton74);
        tab[75] = findViewById(R.id.imageButton75);
        tab[76] = findViewById(R.id.imageButton76);
        tab[77] = findViewById(R.id.imageButton77);
        tab[78] = findViewById(R.id.imageButton78);
        tab[79] = findViewById(R.id.imageButton79);
        tab[80] = findViewById(R.id.imageButton80);
        tab[81] = findViewById(R.id.imageButton81);
        tab[82] = findViewById(R.id.imageButton82);
        tab[83] = findViewById(R.id.imageButton83);
        tab[84] = findViewById(R.id.imageButton84);
        tab[85] = findViewById(R.id.imageButton85);
        tab[86] = findViewById(R.id.imageButton86);
        tab[87] = findViewById(R.id.imageButton87);
        tab[88] = findViewById(R.id.imageButton88);
        tab[89] = findViewById(R.id.imageButton89);
        tab[90] = findViewById(R.id.imageButton90);
        tab[91] = findViewById(R.id.imageButton91);
        tab[92] = findViewById(R.id.imageButton92);
        tab[93] = findViewById(R.id.imageButton93);
        tab[94] = findViewById(R.id.imageButton94);
        tab[95] = findViewById(R.id.imageButton95);
        tab[96] = findViewById(R.id.imageButton96);
        tab[97] = findViewById(R.id.imageButton97);
        tab[98] = findViewById(R.id.imageButton98);
        tab[99] = findViewById(R.id.imageButton99);
        tab[100] = findViewById(R.id.imageButton100);
        tab[101] = findViewById(R.id.imageButton101);
        tab[102] = findViewById(R.id.imageButton102);
        tab[103] = findViewById(R.id.imageButton103);
        tab[104] = findViewById(R.id.imageButton104);
        tab[105] = findViewById(R.id.imageButton105);
        tab[106] = findViewById(R.id.imageButton106);
        tab[107] = findViewById(R.id.imageButton107);
        tab[108] = findViewById(R.id.imageButton108);
        tab[109] = findViewById(R.id.imageButton109);
        tab[110] = findViewById(R.id.imageButton110);
        tab[111] = findViewById(R.id.imageButton111);
        tab[112] = findViewById(R.id.imageButton112);
        tab[113] = findViewById(R.id.imageButton113);
        tab[114] = findViewById(R.id.imageButton114);
        tab[115] = findViewById(R.id.imageButton115);
        tab[116] = findViewById(R.id.imageButton116);
        tab[117] = findViewById(R.id.imageButton117);
        tab[118] = findViewById(R.id.imageButton118);
        tab[119] = findViewById(R.id.imageButton119);
        tab[120] = findViewById(R.id.imageButton120);
        tab[121] = findViewById(R.id.imageButton121);
        tab[122] = findViewById(R.id.imageButton122);
        tab[123] = findViewById(R.id.imageButton123);
        tab[124] = findViewById(R.id.imageButton124);
        tab[125] = findViewById(R.id.imageButton125);
        tab[126] = findViewById(R.id.imageButton126);
        tab[127] = findViewById(R.id.imageButton127);
        tab[128] = findViewById(R.id.imageButton128);
        tab[129] = findViewById(R.id.imageButton129);
        tab[130] = findViewById(R.id.imageButton130);
        tab[131] = findViewById(R.id.imageButton131);
        tab[132] = findViewById(R.id.imageButton132);
        tab[133] = findViewById(R.id.imageButton133);
        tab[134] = findViewById(R.id.imageButton134);
        tab[135] = findViewById(R.id.imageButton135);
        tab[136] = findViewById(R.id.imageButton136);
        tab[137] = findViewById(R.id.imageButton137);
        tab[138] = findViewById(R.id.imageButton138);
        tab[139] = findViewById(R.id.imageButton139);
        tab[140] = findViewById(R.id.imageButton140);
        tab[141] = findViewById(R.id.imageButton141);
        tab[142] = findViewById(R.id.imageButton142);
        tab[143] = findViewById(R.id.imageButton143);
        tab[144] = findViewById(R.id.imageButton144);
        tab[145] = findViewById(R.id.imageButton145);
        tab[146] = findViewById(R.id.imageButton146);
        tab[147] = findViewById(R.id.imageButton147);
        tab[148] = findViewById(R.id.imageButton148);
        tab[149] = findViewById(R.id.imageButton149);
        tab[150] = findViewById(R.id.imageButton150);
        tab[151] = findViewById(R.id.imageButton151);
        tab[152] = findViewById(R.id.imageButton152);
        tab[153] = findViewById(R.id.imageButton153);
        tab[154] = findViewById(R.id.imageButton154);
        tab[155] = findViewById(R.id.imageButton155);
        tab[156] = findViewById(R.id.imageButton156);
        tab[157] = findViewById(R.id.imageButton157);
        tab[158] = findViewById(R.id.imageButton158);
        tab[159] = findViewById(R.id.imageButton159);
        tab[160] = findViewById(R.id.imageButton160);
        tab[161] = findViewById(R.id.imageButton161);
        tab[162] = findViewById(R.id.imageButton162);
        tab[163] = findViewById(R.id.imageButton163);
        tab[164] = findViewById(R.id.imageButton164);
        tab[165] = findViewById(R.id.imageButton165);
        tab[166] = findViewById(R.id.imageButton166);
        tab[167] = findViewById(R.id.imageButton167);
        tab[168] = findViewById(R.id.imageButton168);
        tab[169] = findViewById(R.id.imageButton169);
        tab[170] = findViewById(R.id.imageButton170);
        tab[171] = findViewById(R.id.imageButton171);
        tab[172] = findViewById(R.id.imageButton172);
        tab[173] = findViewById(R.id.imageButton173);
        tab[174] = findViewById(R.id.imageButton174);
        tab[175] = findViewById(R.id.imageButton175);
        tab[176] = findViewById(R.id.imageButton176);
        tab[177] = findViewById(R.id.imageButton177);
        tab[178] = findViewById(R.id.imageButton178);
        tab[179] = findViewById(R.id.imageButton179);
        tab[180] = findViewById(R.id.imageButton180);
        tab[181] = findViewById(R.id.imageButton181);
        tab[182] = findViewById(R.id.imageButton182);
        tab[183] = findViewById(R.id.imageButton183);
        tab[184] = findViewById(R.id.imageButton184);
        tab[185] = findViewById(R.id.imageButton185);
        tab[186] = findViewById(R.id.imageButton186);
        tab[187] = findViewById(R.id.imageButton187);
        tab[188] = findViewById(R.id.imageButton188);
        tab[189] = findViewById(R.id.imageButton189);
        tab[190] = findViewById(R.id.imageButton190);
        tab[191] = findViewById(R.id.imageButton191);
        tab[192] = findViewById(R.id.imageButton192);
        tab[193] = findViewById(R.id.imageButton193);
        tab[194] = findViewById(R.id.imageButton194);
        tab[195] = findViewById(R.id.imageButton195);
        tab[196] = findViewById(R.id.imageButton196);
        tab[197] = findViewById(R.id.imageButton197);
        tab[198] = findViewById(R.id.imageButton198);
        tab[199] = findViewById(R.id.imageButton199);
        tab[200] = findViewById(R.id.imageButton200);
        tab[201] = findViewById(R.id.imageButton201);
        tab[202] = findViewById(R.id.imageButton202);
        tab[203] = findViewById(R.id.imageButton203);
        tab[204] = findViewById(R.id.imageButton204);
        tab[205] = findViewById(R.id.imageButton205);
        tab[206] = findViewById(R.id.imageButton206);
        tab[207] = findViewById(R.id.imageButton207);
        tab[208] = findViewById(R.id.imageButton208);
        tab[209] = findViewById(R.id.imageButton209);
        tab[210] = findViewById(R.id.imageButton210);
        tab[211] = findViewById(R.id.imageButton211);
        tab[212] = findViewById(R.id.imageButton212);
        tab[213] = findViewById(R.id.imageButton213);
        tab[214] = findViewById(R.id.imageButton214);
        tab[215] = findViewById(R.id.imageButton215);
        tab[216] = findViewById(R.id.imageButton216);
        tab[217] = findViewById(R.id.imageButton217);
        tab[218] = findViewById(R.id.imageButton218);
        tab[219] = findViewById(R.id.imageButton219);
        tab[220] = findViewById(R.id.imageButton220);
        tab[221] = findViewById(R.id.imageButton221);
        tab[222] = findViewById(R.id.imageButton222);
        tab[223] = findViewById(R.id.imageButton223);
        tab[224] = findViewById(R.id.imageButton224);
        tab[225] = findViewById(R.id.imageButton225);
        tab[226] = findViewById(R.id.imageButton226);
        tab[227] = findViewById(R.id.imageButton227);
        tab[228] = findViewById(R.id.imageButton228);
        tab[229] = findViewById(R.id.imageButton229);
        tab[230] = findViewById(R.id.imageButton230);
        tab[231] = findViewById(R.id.imageButton231);
        tab[232] = findViewById(R.id.imageButton232);
        tab[233] = findViewById(R.id.imageButton233);
        tab[234] = findViewById(R.id.imageButton234);
        tab[235] = findViewById(R.id.imageButton235);
        tab[236] = findViewById(R.id.imageButton236);
        tab[237] = findViewById(R.id.imageButton237);
        tab[238] = findViewById(R.id.imageButton238);
        tab[239] = findViewById(R.id.imageButton239);
        tab[240] = findViewById(R.id.imageButton240);
        tab[241] = findViewById(R.id.imageButton241);
        tab[242] = findViewById(R.id.imageButton242);
        tab[243] = findViewById(R.id.imageButton243);
        tab[244] = findViewById(R.id.imageButton244);
        tab[245] = findViewById(R.id.imageButton245);
        tab[246] = findViewById(R.id.imageButton246);
        tab[247] = findViewById(R.id.imageButton247);
        tab[248] = findViewById(R.id.imageButton248);
        tab[249] = findViewById(R.id.imageButton249);
        tab[250] = findViewById(R.id.imageButton250);
        tab[251] = findViewById(R.id.imageButton251);
        tab[252] = findViewById(R.id.imageButton252);
        tab[253] = findViewById(R.id.imageButton253);
        tab[254] = findViewById(R.id.imageButton254);
        tab[255] = findViewById(R.id.imageButton255);
        tab[256] = findViewById(R.id.imageButton256);
        tab[257] = findViewById(R.id.imageButton257);
        tab[258] = findViewById(R.id.imageButton258);
        tab[259] = findViewById(R.id.imageButton259);
        tab[260] = findViewById(R.id.imageButton260);
        tab[261] = findViewById(R.id.imageButton261);
        tab[262] = findViewById(R.id.imageButton262);
        tab[263] = findViewById(R.id.imageButton263);
        tab[264] = findViewById(R.id.imageButton264);
        tab[265] = findViewById(R.id.imageButton265);
        tab[266] = findViewById(R.id.imageButton266);
        tab[267] = findViewById(R.id.imageButton267);
        tab[268] = findViewById(R.id.imageButton268);
        tab[269] = findViewById(R.id.imageButton269);
        tab[270] = findViewById(R.id.imageButton270);
        tab[271] = findViewById(R.id.imageButton271);
        tab[272] = findViewById(R.id.imageButton272);
        tab[273] = findViewById(R.id.imageButton273);
        tab[274] = findViewById(R.id.imageButton274);
        tab[275] = findViewById(R.id.imageButton275);
        tab[276] = findViewById(R.id.imageButton276);
        tab[277] = findViewById(R.id.imageButton277);
        tab[278] = findViewById(R.id.imageButton278);
        tab[279] = findViewById(R.id.imageButton279);
        tab[280] = findViewById(R.id.imageButton280);
        tab[281] = findViewById(R.id.imageButton281);
        tab[282] = findViewById(R.id.imageButton282);
        tab[283] = findViewById(R.id.imageButton283);
        tab[284] = findViewById(R.id.imageButton284);
        tab[285] = findViewById(R.id.imageButton285);
        tab[286] = findViewById(R.id.imageButton286);
        tab[287] = findViewById(R.id.imageButton287);
        tab[288] = findViewById(R.id.imageButton288);
        tab[289] = findViewById(R.id.imageButton289);
        tab[290] = findViewById(R.id.imageButton290);
        tab[291] = findViewById(R.id.imageButton291);
        tab[292] = findViewById(R.id.imageButton292);
        tab[293] = findViewById(R.id.imageButton293);
        tab[294] = findViewById(R.id.imageButton294);
        tab[295] = findViewById(R.id.imageButton295);
        tab[296] = findViewById(R.id.imageButton296);
        tab[297] = findViewById(R.id.imageButton297);
        tab[298] = findViewById(R.id.imageButton298);
        tab[299] = findViewById(R.id.imageButton299);
        tab[300] = findViewById(R.id.imageButton300);
        tab[301] = findViewById(R.id.imageButton301);
        tab[302] = findViewById(R.id.imageButton302);
        tab[303] = findViewById(R.id.imageButton303);
        tab[304] = findViewById(R.id.imageButton304);
        tab[305] = findViewById(R.id.imageButton305);
        tab[306] = findViewById(R.id.imageButton306);
        tab[307] = findViewById(R.id.imageButton307);
        tab[308] = findViewById(R.id.imageButton308);
        tab[309] = findViewById(R.id.imageButton309);
        tab[310] = findViewById(R.id.imageButton310);
        tab[311] = findViewById(R.id.imageButton311);
        tab[312] = findViewById(R.id.imageButton312);
        tab[313] = findViewById(R.id.imageButton313);
        tab[314] = findViewById(R.id.imageButton314);
        tab[315] = findViewById(R.id.imageButton315);
        tab[316] = findViewById(R.id.imageButton316);
        tab[317] = findViewById(R.id.imageButton317);
        tab[318] = findViewById(R.id.imageButton318);
        tab[319] = findViewById(R.id.imageButton319);
        tab[320] = findViewById(R.id.imageButton320);
        tab[321] = findViewById(R.id.imageButton321);
        tab[322] = findViewById(R.id.imageButton322);
        tab[323] = findViewById(R.id.imageButton323);
        tab[324] = findViewById(R.id.imageButton324);
        tab[325] = findViewById(R.id.imageButton325);
        tab[326] = findViewById(R.id.imageButton326);
        tab[327] = findViewById(R.id.imageButton327);
        tab[328] = findViewById(R.id.imageButton328);
        tab[329] = findViewById(R.id.imageButton329);
        tab[330] = findViewById(R.id.imageButton330);


        GreenDataBase db = Room.databaseBuilder(getApplicationContext(),
                GreenDataBase.class, "database").build();

        GreenDao greenDao = db.greenDao();

        AsyncTask.execute(() -> {for (int i=1; i<=330; i++) {
            String isGreen = greenDao.getIsGreen(i);
            if ((!isGreen.isEmpty()) && isGreen.equals("true")) {
                tab[i].setBackgroundColor(Color.rgb(0, 255, 0));
            }
        }});

    }

    public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.imageButton1:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Łk 1-4", "1", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Lukasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton2:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Łk 5-8", "2", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Lukasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton3:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Łk 9-12", "3", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Lukasza/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton4:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Łk 13-16", "4", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Lukasza/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton5:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Łk 17-20", "5", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Lukasza/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton6:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Łk 21-24", "6", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Lukasza/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton7:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 1-4", "7", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton8:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 5-8", "8", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton9:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 9-12", "9", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton10:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 13-16", "10", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton11:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 17-20", "11", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton12:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 21-24", "12", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton13:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mt 25-28", "13", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Mateusza/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton14:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mk 1-4", "14", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Marka/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton15:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mk 5-8", "15", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Marka/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton16:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mk 9-12", "16", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Marka/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton17:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mk 13-16", "17", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Marka/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton18:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("J 1-4", "18", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Jana/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton19:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("J 5-8", "19", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Jana/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton20:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("J 9-12", "20", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Jana/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton21:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("J 13-16", "21", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Jana/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton22:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("J 17-21", "22", "http://biblia-online.pl/Biblia/Tysiaclecia/Ewangelia-Jana/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton23:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 1-4", "23", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton24:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 5-8", "24", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton25:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 9-12", "25", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton26:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 13-16", "26", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton27:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 17-20", "27", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton28:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 21-24", "28", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton29:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dz 25-28", "29", "http://biblia-online.pl/Biblia/Tysiaclecia/Dzieje-apostolskie/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton30:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rz 1-4", "30", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-rzymian/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton31:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rz 5-8", "31", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-rzymian/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton32:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rz 9-12", "32", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-rzymian/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton33:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rz 13-16", "33", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-rzymian/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton34:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Kor 1-4", "34", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Koryntian/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton35:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Kor 5-8", "35", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Koryntian/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton36:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Kor 9-12", "36", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Koryntian/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton37:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Kor 13-16", "37", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Koryntian/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton38:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Kor 1-4", "38", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-do-Koryntian/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton39:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Kor 5-8", "39", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-do-Koryntian/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton40:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Kor 9-13", "40", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-do-Koryntian/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton41:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ga 1-3", "41", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Galatow/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton42:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ga 4-6", "42", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Galatow/4/1");
                startActivity(intent);
                break;
            case R.id.imageButton43:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ef 1-3", "43", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Efezjan/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton44:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ef 4-6", "44", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Efezjan/4/1");
                startActivity(intent);
                break;
            case R.id.imageButton45:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Flp 1-4", "45", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Filipian/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton46:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kol 1-4", "46", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Kolosan/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton47:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Tes 1-5", "47", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Tesaloniczan/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton48:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Tes 1-3", "48", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-do-Tesaloniczan/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton49:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Tm 1-3", "49", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Tymoteusza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton50:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Tm 4-6", "50", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-do-Tymoteusza/4/1");
                startActivity(intent);
                break;
            case R.id.imageButton51:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Tm 1-4", "51", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-do-Tymoteusza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton52:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Tt 1-3", "52", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Tytusa/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton53:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Flm 1", "53", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Filemona/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton54:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hbr 1-4", "54", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Hebrajczykow/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton55:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hbr 5-8", "55", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Hebrajczykow/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton56:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hbr 9-13", "56", "http://biblia-online.pl/Biblia/Tysiaclecia/List-do-Hebrajczykow/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton57:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jk 1-5", "57", "http://biblia-online.pl/Biblia/Tysiaclecia/List-Jakuba/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton58:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 P 1-5", "58", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-Piotra/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton59:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 P 1-3", "59", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-Piotra/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton60:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 J 1-5", "60", "http://biblia-online.pl/Biblia/Tysiaclecia/1-List-Jana/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton61:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 J, 3 J, Jud", "60", "http://biblia-online.pl/Biblia/Tysiaclecia/2-List-Jana/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton62:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 1-4", "62", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton63:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 5-8", "63", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton64:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 9-12", "64", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton65:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 13-16", "65", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton66:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 17-20", "66", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton67:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 21-24", "67", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton68:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 25-28", "68", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton69:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 29-32", "69", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton70:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 33-36", "70", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton71:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 37-40", "71", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton72:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 41-45", "72", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/41/1");
                startActivity(intent);
                break;
            case R.id.imageButton73:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rdz 46-50", "73", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rodzaju/46/1");
                startActivity(intent);
                break;
            case R.id.imageButton74:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 1-4", "74", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton75:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 5-8", "75", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton76:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 9-12", "76", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton77:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 13-16", "77", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton78:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 17-20", "78", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton79:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 21-24", "79", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton80:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 25-28", "80", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton81:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 29-32", "81", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton82:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 33-36", "82", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton83:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Wj 37-40", "83", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Wyjscia/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton84:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 1-4", "84", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton85:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 5-8", "85", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton86:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 9-12", "86", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton87:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 13-16", "87", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton88:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 17-20", "88", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton89:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 21-24", "89", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton90:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Kpł 25-27", "90", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Kaplanska/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton91:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 1-4", "91", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton92:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 5-8", "92", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton93:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 9-12", "93", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton94:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 13-16", "94", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton95:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 17-20", "95", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton96:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 21-24", "96", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton97:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 25-28", "97", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton98:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 29-32", "98", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton99:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lb 33-36", "99", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Liczb/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton100:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 1-4", "100", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton101:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 5-8", "101", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton102:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 9-12", "102", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton103:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 13-16", "103", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton104:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 17-20", "104", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton105:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 21-24", "105", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton106:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 25-29", "106", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton107:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pwt 30-34", "107", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Powtorzonego-Prawa/30/1");
                startActivity(intent);
                break;
            case R.id.imageButton108:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Joz 1-4", "108", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jozuego/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton109:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Joz 5-8", "109", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jozuego/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton110:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Joz 9-12", "110", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jozuego/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton111:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Joz 13-16", "111", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jozuego/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton112:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Joz 17-20", "112", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jozuego/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton113:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Joz 21-24", "113", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jozuego/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton114:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Sdz 1-4", "114", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Sedziow/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton115:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Sdz 5-8", "115", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Sedziow/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton116:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Sdz 9-12", "116", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Sedziow/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton117:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Sdz 13-16", "117", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Sedziow/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton118:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Sdz 17-21", "118", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Sedziow/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton119:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Rt 1-4", "119", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Rut/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton120:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 1-4", "120", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton121:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 5-8", "121", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton122:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 9-12", "122", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton123:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 13-16", "123", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton124:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 17-20", "124", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton125:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 21-24", "125", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton126:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 25-28", "126", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton127:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Sm 29-31", "127", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Samuela/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton128:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Sm 1-4", "128", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Samuela/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton129:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Sm 5-8", "129", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Samuela/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton130:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Sm 9-12", "130", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Samuela/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton131:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Sm 13-16", "131", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Samuela/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton132:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Sm 17-20", "132", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Samuela/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton133:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Sm 21-24", "133", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Samuela/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton134:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krl 1-4", "134", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Krolewska/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton135:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krl 5-8", "135", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Krolewska/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton136:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krl 9-12", "136", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Krolewska/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton137:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krl 13-17", "137", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Krolewska/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton138:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krl 18-22", "138", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Krolewska/18/1");
                startActivity(intent);
                break;
            case R.id.imageButton139:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krl 1-4", "139", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Krolewska/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton140:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krl 5-8", "140", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Krolewska/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton141:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krl 9-12", "141", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Krolewska/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton142:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krl 13-16", "142", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Krolewska/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton143:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krl 17-20", "143", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Krolewska/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton144:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krl 21-25", "144", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Krolewska/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton145:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 1-4", "145", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton146:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 5-8", "146", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton147:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 9-12", "147", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton148:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 13-16", "148", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton149:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 17-20", "149", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton150:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 21-24", "150", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton151:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Krn 25-29", "151", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Kronik/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton152:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 1-4", "152", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton153:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 5-8", "153", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton154:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 9-12", "154", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton155:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 13-16", "155", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton156:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 17-20", "156", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton157:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 21-24", "157", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton158:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 25-28", "158", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton159:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 29-32", "159", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton160:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Krn 33-36", "160", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Kronik/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton161:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ezd 1-5", "161", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezdrasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton162:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ezd 6-10", "162", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezdrasza/6/1");
                startActivity(intent);
                break;
            case R.id.imageButton163:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ne 1-4", "163", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Nehemiasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton164:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ne 5-8", "164", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Nehemiasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton165:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ne 9-13", "165", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Nehemiasza/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton166:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Tb 1-4", "166", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Tobiasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton167:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Tb 5-9", "167", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Tobiasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton168:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Tb 10-14", "168", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Tobiasza/10/1");
                startActivity(intent);

            case R.id.imageButton169:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jdt 1-4", "169", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Judyty/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton170:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jdt 5-8", "170", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Judyty/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton171:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jdt 9-12", "171", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Judyty/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton172:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jdt 13-16", "172", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Judyty/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton173:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Est 1-5", "173", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Estery/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton174:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Est 6-10", "174", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Estery/6/1");
                startActivity(intent);
                break;
            case R.id.imageButton175:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Mch 1-4", "175", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Machabejska/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton176:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Mch 5-8", "176", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Machabejska/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton177:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Mch 9-12", "177", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Machabejska/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton178:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("1 Mch 13-16", "178", "http://biblia-online.pl/Biblia/Tysiaclecia/1-Ksiega-Machabejska/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton179:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Mch 1-4", "179", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Machabejska/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton180:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Mch 5-8", "180", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Machabejska/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton181:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Mch 9-12", "181", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Machabejska/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton182:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("2 Mch 13-15", "182", "http://biblia-online.pl/Biblia/Tysiaclecia/2-Ksiega-Machabejska/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton183:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 1-4", "183", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton184:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 5-8", "184", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton185:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 9-12", "185", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton186:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 13-16", "186", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton187:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 17-20", "187", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton188:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 21-24", "188", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton189:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 25-28", "189", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton190:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 29-33", "190", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton191:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 34-37", "191", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/34/1");
                startActivity(intent);
                break;
            case R.id.imageButton192:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Hi 38-42", "192", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Hioba/38/1");
                startActivity(intent);
                break;
            case R.id.imageButton193:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 1-4", "193", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton194:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 5-8", "194", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton195:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 9-12", "195", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton196:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 13-16", "196", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton197:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 17-20", "197", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton198:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 21-24", "198", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton199:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 25-28", "199", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton200:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 29-32", "200", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton201:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 33-36", "201", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton202:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 37-40", "202", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton203:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 41-44", "203", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/41/1");
                startActivity(intent);
                break;
            case R.id.imageButton204:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 45-48", "204", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/45/1");
                startActivity(intent);
                break;
            case R.id.imageButton205:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 49-52", "205", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/49/1");
                startActivity(intent);
                break;
            case R.id.imageButton206:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 53-56", "206", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/53/1");
                startActivity(intent);
                break;
            case R.id.imageButton207:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 57-60", "207", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/57/1");
                startActivity(intent);
                break;
            case R.id.imageButton208:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 61-64", "208", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/61/1");
                startActivity(intent);
                break;
            case R.id.imageButton209:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 65-68", "209", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/65/1");
                startActivity(intent);
                break;
            case R.id.imageButton210:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 69-72", "210", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/69/1");
                startActivity(intent);
                break;
            case R.id.imageButton211:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 73-76", "211", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/73/1");
                startActivity(intent);
                break;
            case R.id.imageButton212:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 77-80", "212", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/77/1");
                startActivity(intent);
                break;
            case R.id.imageButton213:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 81-84", "213", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/81/1");
                startActivity(intent);
                break;
            case R.id.imageButton214:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 85-88", "214", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/85/1");
                startActivity(intent);
                break;
            case R.id.imageButton215:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 89-92", "215", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/89/1");
                startActivity(intent);
                break;
            case R.id.imageButton216:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 93-96", "216", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/93/1");
                startActivity(intent);
                break;
            case R.id.imageButton217:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 97-100", "217", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/97/1");
                startActivity(intent);
                break;
            case R.id.imageButton218:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 101-104", "218", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/101/1");
                startActivity(intent);
                break;
            case R.id.imageButton219:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 105-108", "219", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/105/1");
                startActivity(intent);
                break;
            case R.id.imageButton220:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 109-112", "220", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/109/1");
                startActivity(intent);
                break;
            case R.id.imageButton221:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 113-116", "221", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/113/1");
                startActivity(intent);
                break;
            case R.id.imageButton222:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 117-120", "222", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/117/1");
                startActivity(intent);
                break;
            case R.id.imageButton223:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 121-124", "223", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/121/1");
                startActivity(intent);
                break;
            case R.id.imageButton224:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 125-128", "224", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/125/1");
                startActivity(intent);
                break;
            case R.id.imageButton225:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 129-132", "225", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/129/1");
                startActivity(intent);
                break;
            case R.id.imageButton226:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 133-136", "226", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/133/1");
                startActivity(intent);
                break;
            case R.id.imageButton227:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 137-140", "227", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/137/1");
                startActivity(intent);
                break;
            case R.id.imageButton228:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 141-145", "228", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/141/1");
                startActivity(intent);
                break;
            case R.id.imageButton229:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ps 146-150", "229", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Psalmow/146/1");
                startActivity(intent);
                break;
            case R.id.imageButton230:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 1-4", "230", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton231:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 5-8", "231", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton232:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 9-12", "232", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton233:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 13-16", "233", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton234:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 17-20", "234", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton235:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 21-24", "235", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton236:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 25-28", "236", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton237:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Prz 29-31", "237", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Przyslow/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton238:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Koh 1-4", "238", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Koheleta/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton239:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Koh 5-8", "239", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Koheleta/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton240:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Koh 9-12", "240", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Koheleta/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton241:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pnp 1-4", "241", "http://biblia-online.pl/Biblia/Tysiaclecia/Piesn-nad-Piesniami/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton242:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Pnp 5-8", "242", "http://biblia-online.pl/Biblia/Tysiaclecia/Piesn-nad-Piesniami/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton243:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mdr 1-4", "243", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Madrosci/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton244:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mdr 5-8", "244", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Madrosci/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton245:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mdr 9-12", "245", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Madrosci/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton246:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mdr 13-16", "246", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Madrosci/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton247:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mdr 17-19", "247", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Madrosci/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton248:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 1-4", "248", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton249:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 5-8", "249", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton250:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 9-12", "250", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton251:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 13-16", "251", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton252:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 17-20", "252", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton253:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 21-24", "253", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton254:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 25-28", "254", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton255:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 29-32", "255", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton256:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 33-36", "256", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton257:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 37-40", "257", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton258:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 41-44", "258", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/41/1");
                startActivity(intent);
                break;
            case R.id.imageButton259:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 45-48", "259", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/45/1");
                startActivity(intent);
                break;
            case R.id.imageButton260:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Syr 49-51", "260", "http://biblia-online.pl/Biblia/Tysiaclecia/Madrosc-Syracha/49/1");
                startActivity(intent);
                break;
            case R.id.imageButton261:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 1-4", "261", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton262:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 5-8", "262", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton263:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 9-12", "263", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton264:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 13-16", "264", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton265:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 17-20", "265", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton266:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 21-24", "266", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton267:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 25-28", "267", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton268:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 29-32", "268", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton269:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 33-36", "269", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton270:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 37-40", "270", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton271:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 41-44", "271", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/41/1");
                startActivity(intent);
                break;
            case R.id.imageButton272:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 45-48", "272", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/45/1");
                startActivity(intent);
                break;
            case R.id.imageButton273:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 49-52", "273", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/49/1");
                startActivity(intent);
                break;
            case R.id.imageButton274:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 53-56", "274", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/53/1");
                startActivity(intent);
                break;
            case R.id.imageButton275:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 57-61", "275", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/57/1");
                startActivity(intent);
                break;
            case R.id.imageButton276:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Iz 62-66", "276", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Izajasza/62/1");
                startActivity(intent);
                break;
            case R.id.imageButton277:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 1-4", "277", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton278:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 5-8", "278", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton279:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 9-12", "279", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton280:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 13-16", "280", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton281:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 17-20", "281", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton282:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 21-24", "282", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton283:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 25-28", "283", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton284:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 29-32", "284", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton285:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 33-36", "285", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton286:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 37-40", "286", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton287:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 41-44", "287", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/41/1");
                startActivity(intent);
                break;
            case R.id.imageButton288:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 45-48", "288", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/45/1");
                startActivity(intent);
                break;
            case R.id.imageButton289:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jr 49-52", "289", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Jeremiasza/49/1");
                startActivity(intent);
                break;
            case R.id.imageButton290:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Lm 1-5", "290", "http://biblia-online.pl/Biblia/Tysiaclecia/Lamentacje-Jeremiasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton291:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ba 1-6", "291", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Barucha/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton292:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 1-4", "292", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton293:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 5-8", "293", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton294:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 9-12", "294", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton295:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 13-16", "295", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton296:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 17-20", "296", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton297:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 21-24", "297", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/21/1");
                startActivity(intent);
                break;
            case R.id.imageButton298:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 25-28", "298", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/25/1");
                startActivity(intent);
                break;
            case R.id.imageButton299:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 29-32", "299", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/29/1");
                startActivity(intent);
                break;
            case R.id.imageButton300:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 33-36", "300", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/33/1");
                startActivity(intent);
                break;
            case R.id.imageButton301:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 37-40", "301", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/37/1");
                startActivity(intent);
                break;
            case R.id.imageButton302:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 41-44", "302", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/41/1");
                startActivity(intent);
                break;
            case R.id.imageButton303:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ez 45-48", "303", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ezechiela/45/1");
                startActivity(intent);
                break;
            case R.id.imageButton304:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dn 1-4", "304", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Daniela/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton305:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dn 5-8", "305", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Daniela/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton306:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dn 9-12", "306", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Daniela/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton307:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Dn 13-14", "307", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Daniela/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton308:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Oz 1-4", "308", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ozeasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton309:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Oz 5-9", "309", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ozeasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton310:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Oz 10-14", "310", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Ozeasza/10/1");
                startActivity(intent);
                break;
            case R.id.imageButton311:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Jl 1-4", "311", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Joela/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton312:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Am 1-4", "312", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Amosa/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton313:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Am 5-9", "313", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Amosa/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton314:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ab 1, Jon 1-4", "314", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Abdiasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton315:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mi 1-4", "315", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Micheasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton316:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Mi 5-7", "316", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Micheasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton317:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Na 1-3", "317", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Nahuma/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton318:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ha 1-3", "318", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Habakuka/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton319:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("So 1-3", "319", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Sofoniasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton320:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ag 1-2", "320", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Aggeusza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton321:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Za 1-4", "321", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Zachariasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton322:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Za 5-9", "322", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Zachariasza/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton323:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Za 10-14", "323", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Zachariasza/10/1");
                startActivity(intent);
                break;
            case R.id.imageButton324:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ml 1-3", "324", "http://biblia-online.pl/Biblia/Tysiaclecia/Ksiega-Malachiasza/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton325:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ap 1-4", "325", "http://biblia-online.pl/Biblia/Tysiaclecia/Apokalipsa-Swietego-Jana/1/1");
                startActivity(intent);
                break;
            case R.id.imageButton326:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ap 5-8", "326", "http://biblia-online.pl/Biblia/Tysiaclecia/Apokalipsa-Swietego-Jana/5/1");
                startActivity(intent);
                break;
            case R.id.imageButton327:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ap 9-12", "327", "http://biblia-online.pl/Biblia/Tysiaclecia/Apokalipsa-Swietego-Jana/9/1");
                startActivity(intent);
                break;
            case R.id.imageButton328:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ap 13-16", "328", "http://biblia-online.pl/Biblia/Tysiaclecia/Apokalipsa-Swietego-Jana/13/1");
                startActivity(intent);
                break;
            case R.id.imageButton329:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ap 17-20", "329", "http://biblia-online.pl/Biblia/Tysiaclecia/Apokalipsa-Swietego-Jana/17/1");
                startActivity(intent);
                break;
            case R.id.imageButton330:
                intent = new Intent(WholeProgramActivity.this, DayActivity.class);
                DayActivity.makeStr("Ap 21-22", "330", "http://biblia-online.pl/Biblia/Tysiaclecia/Apokalipsa-Swietego-Jana/21/1");
                startActivity(intent);
                break;
        }
    }
}