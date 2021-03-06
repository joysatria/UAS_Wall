package com.example.uas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {

    //deklarasi RecyclerView
    RecyclerView rcvMain;

    //deklarasi Array list untuk menyimpan data yang akan dipakai nantinya dan akan ditampilkan
    // dalam RecyclerView
    ArrayList<String> imgArraylist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        imgArraylist.add("https://images.unsplash.com/photo-1495978866932-92dbc079e62e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=sbAeA6ZhEx908NyK-3cdkDe-wD6529-mte7_ChR3wKfFE_OyX77S6KL9odXqGXoSpC8oN4ayII25ZNRUDn0rxE6yO15vfkZFY8ArMsQoHSVaI43urUt6Dk8SiMoNfE-07U267JUqpiiJ75ua");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=pCpfzLwprRi9o-rzrHyaUUhm1-cJEtlmlfRhGTMykYh_ZyeR6U3fACewBpfCvF6tMqTXs22LdlOg3dfqJcSO-tbK-J-P4NrUYgkRHYYbCo14z7j_jQS8phH2YLUmWOU1DpvujCYooWINw_3R");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=xdMvuP5_GKoEO3cn8Dg_WFEiLWlIjtZR6L0vK78FyJCRXpMZdYjohq3GN_KJK6AKY97kZtCnx38buqHOR4rrKzS8WLvAAH2DpE9cqWfuylKiP5Drwm7621K65QUtMoWVevtB32SLsk3XAsZf");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=X2EbPLt85wXPb0Rx9Liv6Kpu62o3jJFeOcoTg8LcJJ01o5ZATex1jAJ5xqAeBHCfE3_VvruuslzTdEj6l0xQtXoVb2_PDbhzi7PSqbgu-7vntfjEnRNEXlh8dku_7UykU8sPJeZ-eYggVpqE");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=LRiE0jsHtXJruwNYqB8cl7PXvASJPyNuDfZi4JRG0zWW7t1obEI9KgY2BUf5vyQC6Zc2Wvf5xTFAUMS7qvee3b7ePuaQV40SGg2Cxv_u0p7zMuzC9Bzj9OxRd4V0ZfjKzZUhZ6wPrkrCEEat");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=EKN-SBd4pZ0915Eo7Hd6OyIjYicd6jdGX8_kMz04x0Cjw3HMH7rDSpJHCYLPHk81-3718DOSzryh7_bQPx42UoHdQtcP8Uq21ZD5u0Eh8Qox8woaIbqESvCueDyad28_pPhGW5jBxdXhowKQ");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=nzvIZDWZP61yjylQX_NGFZFC6LrqyispNyEPTU-gxeXkT-cHcubleowgGn2niMrUpvUh7_jBNL8PwbJdO2oNaDCgPjMJV_4tYYSjEQdf-d4hECsm3mzQL0d5YADHZvX3iwYOombp_zYNBknR");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=V80kh1afTzEn2BaclpLBscTzC_YFWi_Lezt7DtMlmNOTDMzm76Kz3RF5wpH4bDRqj3Jz1QrFV9TmwQq4qUxSbgyHuN510pOrRKYyWiP-f-x3wdT8WOh3OU5ltOf4yaazRmPBjssYJ6NXKweF");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=hPxqNr-a78JeOdC9-NE9pZN9HJmYEXM8oBtxY84Wo77csj9dQGINGGQRz-14j1iCrCXYtythaVYGjeg58i5JW1_MYxPAMdTlfUBFG3R1mqAort3mYb4y8TQ84n7w0jPcLzGiCRjxUCn-eyct");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=VJOnuLrAj9WXKCElOunEU-uPXDHNtM5TOyGMWtxNiiOczvaDHRqbG4pFbl_dI7DmIpHp5Z-GnsoRwUFJJ-2m0PyRxZdesEd2MWLhiENpdH5zQcDmzgJkj9qS74-ZBnS0iX4WveHNdvtC-UT2");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=sbAeA6ZhEx908NyK-3cdkDe-wD6529-mte7_ChR3wKfFE_OyX77S6KL9odXqGXoSpC8oN4ayII25ZNRUDn0rxE6yO15vfkZFY8ArMsQoHSVaI43urUt6Dk8SiMoNfE-07U267JUqpiiJ75ua");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=pCpfzLwprRi9o-rzrHyaUUhm1-cJEtlmlfRhGTMykYh_ZyeR6U3fACewBpfCvF6tMqTXs22LdlOg3dfqJcSO-tbK-J-P4NrUYgkRHYYbCo14z7j_jQS8phH2YLUmWOU1DpvujCYooWINw_3R");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=xdMvuP5_GKoEO3cn8Dg_WFEiLWlIjtZR6L0vK78FyJCRXpMZdYjohq3GN_KJK6AKY97kZtCnx38buqHOR4rrKzS8WLvAAH2DpE9cqWfuylKiP5Drwm7621K65QUtMoWVevtB32SLsk3XAsZf");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=X2EbPLt85wXPb0Rx9Liv6Kpu62o3jJFeOcoTg8LcJJ01o5ZATex1jAJ5xqAeBHCfE3_VvruuslzTdEj6l0xQtXoVb2_PDbhzi7PSqbgu-7vntfjEnRNEXlh8dku_7UykU8sPJeZ-eYggVpqE");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=LRiE0jsHtXJruwNYqB8cl7PXvASJPyNuDfZi4JRG0zWW7t1obEI9KgY2BUf5vyQC6Zc2Wvf5xTFAUMS7qvee3b7ePuaQV40SGg2Cxv_u0p7zMuzC9Bzj9OxRd4V0ZfjKzZUhZ6wPrkrCEEat");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=EKN-SBd4pZ0915Eo7Hd6OyIjYicd6jdGX8_kMz04x0Cjw3HMH7rDSpJHCYLPHk81-3718DOSzryh7_bQPx42UoHdQtcP8Uq21ZD5u0Eh8Qox8woaIbqESvCueDyad28_pPhGW5jBxdXhowKQ");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=nzvIZDWZP61yjylQX_NGFZFC6LrqyispNyEPTU-gxeXkT-cHcubleowgGn2niMrUpvUh7_jBNL8PwbJdO2oNaDCgPjMJV_4tYYSjEQdf-d4hECsm3mzQL0d5YADHZvX3iwYOombp_zYNBknR");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=V80kh1afTzEn2BaclpLBscTzC_YFWi_Lezt7DtMlmNOTDMzm76Kz3RF5wpH4bDRqj3Jz1QrFV9TmwQq4qUxSbgyHuN510pOrRKYyWiP-f-x3wdT8WOh3OU5ltOf4yaazRmPBjssYJ6NXKweF");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=hPxqNr-a78JeOdC9-NE9pZN9HJmYEXM8oBtxY84Wo77csj9dQGINGGQRz-14j1iCrCXYtythaVYGjeg58i5JW1_MYxPAMdTlfUBFG3R1mqAort3mYb4y8TQ84n7w0jPcLzGiCRjxUCn-eyct");

        rcvMain=findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new GridLayoutManager(this, 2)); //grid untuk mengatur brp baris yg akn ditampilkan di sini 2 baris saja yang dipakai

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(SecondPage.this,imgArraylist);
        rcvMain.setAdapter(recyclerViewAdapter); //set untuk memunculkan data pada array agar muncul dalam RecyclerView
    }
}