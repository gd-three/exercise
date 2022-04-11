package pers.gandong.git;

/**
 * @description: 新增活动
 * @author: gandong
 * @date: 2022-04-11 15:24
 */
public class Activity {

    /**
     * @param times 次数
     * @return boolean
     * @throws
     */
    public boolean draw(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(i);
        }
        return true;
    }

    /**
     * @param id 打开具体
     * @return boolean
     * @throws
     */
    public boolean openBox(int id) {
        System.out.println();
        return true;
    }
}
