package xmu.litemall.dao;

import org.apache.ibatis.annotations.Param;
import xmu.litemall.domain.LitemallGroupon;
import xmu.litemall.domain.LitemallGrouponExample;


import java.util.List;

public interface LitemallGrouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    long countByExample(LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int insert(LitemallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    LitemallGroupon selectOneByExample(LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    LitemallGroupon selectOneByExampleSelective(@Param("example") LitemallGrouponExample example, @Param("selective") LitemallGroupon.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    List<LitemallGroupon> selectByExampleSelective(@Param("example") LitemallGrouponExample example, @Param("selective") LitemallGroupon.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    List<LitemallGroupon> selectByExample(LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    LitemallGroupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGroupon.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    LitemallGroupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    LitemallGroupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGroupon record, @Param("example") LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGroupon record, @Param("example") LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}