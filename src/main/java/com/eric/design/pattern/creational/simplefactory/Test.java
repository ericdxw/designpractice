package com.eric.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Video video = new PythonVideo();
//        video.producVideo();
        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.producVideo();
    }
}
