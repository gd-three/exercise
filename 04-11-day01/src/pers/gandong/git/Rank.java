package pers.gandong.git;

/**
 * @description: 排行榜类
 * @author: gandong
 * @date: 2022-04-11 14:22
 */
public class Rank {
    /**
     * 玩家ID
     */
    private String id;
    /**
     * 名称
     */
    private String name;

    /**
     * 玩家等级
     */
    private int grade;
    /**
     * 积分
     */
    private int score;
    /**
     * 排名
     */
    private int rank;

    public int getRank() {
        return rank;
    }
}
