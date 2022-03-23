//package com.practise.finance.common.jwt;
//
//
//import io.jsonwebtoken.*;
//import org.springframework.util.StringUtils;
//
//import java.util.Date;
//
//public class JwtHelper {
//    private static long tokenExpiration = 24*60*60*1000;
//    private static String tokenSignKey = "wuStudy";
//
//    //根据参数生成token，参数你自己可以改变
//    public static String createToken(Long userId, String userName) {
//        String token = Jwts.builder()
//                .setSubject("SRB-USER")
//                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))
//                .claim("userId", userId)
//                .claim("userName", userName)
//                .signWith(SignatureAlgorithm.HS512, tokenSignKey)
//                .compressWith(CompressionCodecs.GZIP)
//                .compact();
//        return token;
//    }
//    //根据token获取参数信息
//    public static Long getUserId(String token) {
//        if(StringUtils.isEmpty(token)) return null;
//        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
//        Claims claims = claimsJws.getBody();
//        Integer userId = (Integer)claims.get("userId");
//        return userId.longValue();
//    }
//
//    //根据token获取参数信息
//    public static String getUserName(String token) {
//        if(StringUtils.isEmpty(token)) return "";
//        Jws<Claims> claimsJws
//                = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
//        Claims claims = claimsJws.getBody();
//        return (String)claims.get("userName");
//    }
//
//    //测试方法
//    public static void main(String[] args) {
//        String token = JwtHelper.createToken(1L, "china");
//        System.out.println(token);
//        System.out.println(JwtHelper.getUserId(token));
//        System.out.println(JwtHelper.getUserName(token));
//    }
//}