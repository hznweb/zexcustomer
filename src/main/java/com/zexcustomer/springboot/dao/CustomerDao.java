package com.zexcustomer.springboot.dao;

import com.zexcustomer.springboot.model.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustomerDao extends IBaseDao<Customer> {

    /**
     *根绝指定标识符读取对应信息
     * @param contractname
     * */
    Customer getCusContractname(String contractname);

    /**
     * 获取数据库中相同账户名的数量，用于判断创建账户时的账户名是否重名
     *
     * @param contractname
     * @return
     */
    Customer countCustomer(String contractname);

    /**
     * 查找在数据库中除了指定账户外，和该用户名一样的个数
     *
     * @param contractname 要统计的账户名
     * @param id       账户主键，除了该账户外
     * @return 返回相同用户名的个数，0表示不重名
     */
    int countOtherSearch(@Param(value = "contractname") String contractname,@Param(value = "id") Integer id);
}
