package com.leon.spring.annotationLearn;

/**
 * Created by leon on 2018/2/9.
 */
public class ForumService {
    @NeedTestAnnotation
    public void removeTopicId(int topicId) {
        System.out.println("remove topicId" + topicId);
    }

    @NeedTestAnnotation(value = true)
    public void removeForumId(int forumId) {
        System.out.println("remove forumId" + forumId);
    }
}
