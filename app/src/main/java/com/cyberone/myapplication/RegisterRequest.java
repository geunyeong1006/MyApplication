//package com.cyberone.myapplication;
//
//public class RegisterRequest {
//
//
//    public class RegisterRequest extends StringRequest{
//        final static private String URL = "http://10.0.2.2/UserInfo.php";
//        private Map<String, String> parameters;
//
//        public RegisterRequest(String userName, String userID, Response.Listener<String> listener) {
//            super(Method.POST, URL, listener, null);
//            parameters = new HashMap<>();
//            parameters.put("userName", userName);
//            parameters.put("userID", userID);
//        }
//
//        @Override
//        public Map<String, String> getParams() {
//            return parameters;
//        }
//}
