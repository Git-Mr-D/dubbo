package com.dubbo.mapper;

import java.util.List;
import java.util.Map;

public interface HelloMapper {
    List<Map<String,Object>> selectHello();
}
