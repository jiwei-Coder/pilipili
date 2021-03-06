package com.pilipili.dao;

import com.pilipili.entity.Video;

import java.util.List;

/**
 * Create by misty on 2019/12/24 15:07
 */
public interface VideoDao {
    /**
     * 找出当前用户点击最高的前num个视频
     * @param num  视频个数
     * @param user_id  用户id
     * @return
     */
    public List<Video> selectVideosByClickTimes(int num, Integer user_id);

    /**
     * 找出每个栏目下点击次数前num个
     * @param num  个数
     * @param category_id  栏目id
     * @return
     */
    public List<Video> selectVideosByCategoryId(int num,Integer category_id);

    /**
     * 视频点赞量加一
     * @param video_id
     * @param addClickTimes
     */
    public void updateVideoClickTimes(Integer video_id, Integer addClickTimes);

    /**
     * 查询用户发表的额视频
     * @param user_id  用户id
     * @return
     */
    public List<Video> selectVideosByUserId(Integer user_id);

    /**
     * 查询用户点赞的所有视频,按时间倒序排序
     * @param user_id  用户id
     * @return
     */
    public List<Video> selectLikeVideosByUserId(Integer user_id);

    /**
     * 根据视频id删除视频
     * @param video_id  视频id
     */
    public void deleteVideoById(Integer video_id);




}
