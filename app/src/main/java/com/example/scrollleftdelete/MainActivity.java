package com.example.scrollleftdelete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeMenuListView swipeMenuListView;
    private ListView mLv;
    SwipeMenuCreator creator;

    TabLayout mTabLayout;
    private ViewPager mViewPager;
    MessageManagementAdapter mMessageManagementAdapter;
    List<String> titles = new ArrayList<>();
    List<Fragment> fragments = new ArrayList<>();

    private List<String> mAppList = new ArrayList<>();
//    private AppAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mAppList.add("1");
//        mAppList.add("1");
//        mAppList.add("1");
        initData();
        mTabLayout = findViewById(R.id.agr_consult_tab);
        mViewPager = findViewById(R.id.agr_consult_view_pager);
        mMessageManagementAdapter = new MessageManagementAdapter(getSupportFragmentManager(), titles, fragments);
        mViewPager.setAdapter(mMessageManagementAdapter);

        mTabLayout = findViewById(R.id.agr_consult_tab);
        mTabLayout.setupWithViewPager(mViewPager);
      }
    public void initView(View view){
        mTabLayout = view.findViewById(R.id.agr_consult_tab);
        mViewPager = view.findViewById(R.id.agr_consult_view_pager);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setAdapter(mMessageManagementAdapter);

    }
    public void initData(){
        titles.add("常见问题说明");
        titles.add("答疑解惑");
        fragments.add(BlankFragment.newInstance("1",false));
        fragments.add(BlankFragment.newInstance("2",false));
    }
    /**
     * 创建策划的Menu
     */
//    private void creatSwipeMenu() {
//        creator = new SwipeMenuCreator() {
//            @Override
//            public void create(SwipeMenu menu) {
//                // create "open" item
//
//                // create "delete" item
//                SwipeMenuItem deleteItem = new SwipeMenuItem(
//                       getApplicationContext());
//                // set item background
//                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
//                        0x3F, 0x25)));
//                // set item width
//                deleteItem.setWidth(dp2px(90));
//                // set a icon
////                deleteItem.setIcon(R.drawable.delete);
//                // add to menu
//                menu.addMenuItem(deleteItem);
//            }
//        };
//    }
//    /**
//     * 点击SwipMenu触发的事件
//     *
//     * @param swipeMenuListView
//     */
//    private void onClickListener(SwipeMenuListView swipeMenuListView) {
//        swipeMenuListView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
//                String item = mAppList.get(position);
//                switch (index) {
//
//                    case 0:
//                        // delete
//                        delete();
//                        mAppList.remove(position);
////                        mAdapter.notifyDataSetChanged();
//                        break;
//                }
//                return false;
//            }
//        });
//        // set SwipeListener
//        swipeMenuListView.setOnSwipeListener(new SwipeMenuListView.OnSwipeListener() {
//            @Override
//            public void onSwipeStart(int position) {
//                // swipe start
//                Toast.makeText(getApplicationContext(), position + " swipe start", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onSwipeEnd(int position) {
//                // swipe end
//                Toast.makeText(getApplicationContext(), position + " swipe end", Toast.LENGTH_SHORT).show();
//            }
//        });
//        // set MenuStateChangeListener
//        swipeMenuListView.setOnMenuStateChangeListener(new SwipeMenuListView.OnMenuStateChangeListener() {
//            @Override
//            public void onMenuOpen(int position) {
//                Toast.makeText(getApplicationContext(), position + " onMenuOpen", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onMenuClose(int position) {
//                Toast.makeText(getApplicationContext(), position + " onMenuClose", Toast.LENGTH_SHORT).show();
//            }
//        });
//        swipeMenuListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view,
//                                           int position, long id) {
//                Toast.makeText(getApplicationContext(), position + " long click", Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });
//
//    }
//
//    /**
//     *      * 删除应用
//     *      * @param item
//     */
//    private void delete( ) {
//        // delete app
////        ToastUtils.showShortToast(get,"hah");
//        Toast.makeText(getApplicationContext(),  " dm", Toast.LENGTH_SHORT).show();
//    }
//
//    private int dp2px(int dp) {
//        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
//                getResources().getDisplayMetrics());
//    }

}
