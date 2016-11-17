package record;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sds.study.recordapp.R;

import java.util.ArrayList;
import java.util.List;

/*
 파일목록을 보여줄 프레그먼트
*/
public class ListFragment extends Fragment{
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> list=new ArrayList<String>();

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,null);
        listView=(ListView)view.findViewById(R.id.listView);

        list=(ArrayList) getFiles();
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);/*껍데기와 연결*/
        return view;
    }

    /*외부 저장소인 iot_record  디렉토리의 모든 파일을
    * 가져오자!!*/
    public List getFiles(){
        return null;
    }


}
