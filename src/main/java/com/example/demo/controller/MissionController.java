package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MissionController {

    /*
    * 미션 1. 더하기 API
    * 목표 : 숫자 2개를 서버에 보내고 서버가 더한 결과를 돌려주는 것을 확인한다
    */
    @PostMapping("/add")
    public Map<String, Integer> add(@RequestBody Map<String, Integer> request) {

        int a = request.get("a");
        int b = request.get("b");

        int sum = a + b;

        Map<String, Integer> response = new HashMap<>();
        response.put("result", sum);

        return response;
    }

    /*
     * 미션 2. 좌표 평균 API
     * 목표 : 숫자 4개를 받아서 평균을 계산해 돌려준다
     */
    @PostMapping("/average")
    public Map<String, Double> average(@RequestBody Map<String, Double> request) {

        double lat1 = request.get("lat1");
        double lng1 = request.get("lng1");
        double lat2 = request.get("lat2");
        double lng2 = request.get("lng2");

        double latAvg = (lat1 + lat2) / 2;
        double lngAvg = (lng1 + lng2) / 2;

        Map<String, Double> response = new HashMap<>();
        response.put("lat", latAvg);
        response.put("lng", lngAvg);

        return response;
    }

    /*
     * 미션 3. 결과 문장 만들기 API
     * 목표 : 숫자를 받아서 사람이 읽을 수 있는 문장을 마들어 돌려준다
     */
    @PostMapping("/message")
    public Map<String, String> message(@RequestBody Map<String, Double> request) {

        double lat = request.get("lat");
        double lng = request.get("lng");

        String msg = "중간 지점은 (" + lat + ", " + lng + ") 입니다.";

        Map<String, String> response = new HashMap<>();
        response.put("message", msg);

        return response;
    }
}
