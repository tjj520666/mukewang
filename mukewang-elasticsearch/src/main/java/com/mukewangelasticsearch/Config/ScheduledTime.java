package com.mukewangelasticsearch.Config;

import com.dao.MvMapper;
import com.entity.Mv;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduledTime {
    @Autowired
    JestClient jestClient;
//    @Autowired
//    Elasticsearch elasticsearch;
    @Autowired
    MvMapper mvmap;

//    public void find(){
//        elasticsearch.deleteAll();
//        List<Mv> mvs = mvmap.selectByExample(null);
//        for (Mv m:mvs
//                ) {
//            elasticsearch.save(m);
//        }
//    }
    @Scheduled(cron = "* 0 * * * *")
    public void find()throws Exception{
        List<Mv> mvs = mvmap.selectByAll();
        for (Mv mv : mvs) {
            Index build = new Index.Builder(mv).index("mukewang").type("mv").build();
            jestClient.execute(build);
        }

    }
}
