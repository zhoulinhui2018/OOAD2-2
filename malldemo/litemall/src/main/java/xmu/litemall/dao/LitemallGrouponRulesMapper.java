package xmu.litemall.dao;

import org.apache.ibatis.annotations.Param;
import xmu.litemall.domain.LitemallGrouponRules;
import xmu.litemall.domain.LitemallGrouponRulesExample;
;

import java.util.List;

public interface LitemallGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int insert(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    LitemallGrouponRules selectOneByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    LitemallGrouponRules selectOneByExampleSelective(@Param("example") LitemallGrouponRulesExample example, @Param("selective") LitemallGrouponRules.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    List<LitemallGrouponRules> selectByExampleSelective(@Param("example") LitemallGrouponRulesExample example, @Param("selective") LitemallGrouponRules.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    List<LitemallGrouponRules> selectByExample(LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    LitemallGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGrouponRules.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    LitemallGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    LitemallGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGrouponRules record, @Param("example") LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGrouponRules record, @Param("example") LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_rules
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}