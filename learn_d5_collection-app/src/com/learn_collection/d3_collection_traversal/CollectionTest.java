package com.learn_collection.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {

        //创建一个集合容器，用于存储电影对象
        Collection<Server> servers = new ArrayList<>();
        servers.add(new Server("中式推拿",4.0,"小优"));
        servers.add(new Server("泰式SPA",4.5,"小张"));
        servers.add(new Server("至尊SPA",5.0,"小王"));
        System.out.println(servers);

        //遍历 ： 增强for
        for (Server server : servers) {
            System.out.println("服务名："+server.getName());
            System.out.println("评分："+server.getScore());
            System.out.println("服务技师："+server.getActor());
            System.out.println("-------------");
        }

    }
}
