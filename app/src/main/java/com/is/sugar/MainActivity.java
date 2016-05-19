package com.is.sugar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.is.sugar.domain.Book;
import com.orm.SugarDb;
import com.orm.SugarRecord;
import com.orm.util.NamingHelper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_show=(TextView)this.findViewById(R.id.tv_show);

        SugarDb sugarDb=new SugarDb(getApplicationContext());
        SchemaGeneratorUtil schemaGeneratorUtil=new SchemaGeneratorUtil(getApplicationContext());
        sugarDb.getDB().execSQL(schemaGeneratorUtil.createTableSQL(Book.class));


        List<Book> books = new ArrayList<>();
        for (int i=0;i<10000;i++){
            books.add(new Book("标题", "内容"));
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");

        Log.e("msg", format.format(new Date()));

        SugarRecord.saveInTx(books);

        Log.e("msg", format.format(new Date()));

       // books= Book.find(Book.class,"title=?","标题");
        //Book.deleteAll(Book.class);
        sugarDb.close();

 /*       StringBuffer stringbuffer = new StringBuffer();
        for (int i=0;i<books.size();i++){
            stringbuffer.append(books.get(i).toString()+"\n");
        }*/

        //tv_show.setText(stringbuffer.toString());
    }
}
