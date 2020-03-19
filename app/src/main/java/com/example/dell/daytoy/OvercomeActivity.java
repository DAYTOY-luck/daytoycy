package com.example.dell.daytoy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.CollapsibleActionView;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.Collection;

public class OvercomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button mBtnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overcome_layout);

        mBtnWebView =(Button)findViewById(R.id.Btn_WebView);//跳转中央新闻网页按钮
        setListeners();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //添加一个选项菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.overcome, menu);
        return true;
    }

    //主页菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_message:
                Toast.makeText(this,"尚未完成",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_friends:
                Toast.makeText(this,"尚未完成",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_dynamic:
                Intent intent =new Intent(OvercomeActivity.this,DynamicActivity.class);//跳转到动态页面
                startActivity(intent);
                break;
            case R.id.action_collection:
                Intent intent1 =new Intent(OvercomeActivity.this,CollectionActivity.class);//跳转到收藏页面
                startActivity(intent1);
                break;
            default:
        }
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")

    //侧滑栏菜单点击事件
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.mine_login) {
            Intent intent =new Intent(OvercomeActivity.this,LoginActivity.class);//跳转到登录页面
            startActivity(intent);
        } else if (id == R.id.contribution) {
            Intent intent =new Intent(OvercomeActivity.this,ContributionActivity.class);//跳转到微博微公益募捐页面
            startActivity(intent);
        } else if (id == R.id.fundraising) {
            Intent intent =new Intent(OvercomeActivity.this,MActivity.class);//跳转到微博微公益募捐页面
            startActivity(intent);
        } else if (id == R.id.nav_manage) {
            Toast.makeText(this,"尚未完成",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_news) {
            Intent intent =new Intent(OvercomeActivity.this,WebViewActivity.class);//跳转到中央新闻页面
            startActivity(intent);
        } else if (id == R.id.nav_telephone) {
            Toast.makeText(this,"尚未完成",Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //新闻按钮点击事件
    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnWebView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent=null;
            switch(v.getId()){
                case R.id.Btn_WebView:
                    intent= new Intent(OvercomeActivity.this,WebViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
