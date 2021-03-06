package mapper1;

import java.util.List;

import bean.User;
import bean.UserVo;

public interface UserMapper
{

	// 1 接口方法名 与mapper.xml 中的 要调用的sql 语句的id 要一致
	// 2 接口的形参类型需要与 mappe.xml parameterType 一致
	// 3 返回值类型也需要 与 resultType相一致
	// 4 mapper.xml 中 namespace 要与接口的全包名一致
	// 5 mapper 动态代理开发中 根据返回值类型自动选择 selectOne （id查询） selectList （模糊查询）

	public User selectUserById(Integer id);

	// public List<User> User selectUser(User user);
	// 再来一遍
	// 接口方法名要与 调用的sql的语句中的id 一致
	// 接口的类型要与 parameterType 一致
	// 返回值类型要与 resultType 一致

	public List<User> selectUserByName(String username);

	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUserById(int id);

	// 通过 UserVo 中的id 查询
	public User selectUserByUserVoId(UserVo  vo);
	
	public Integer selectUserCount();
	
	//查询所有用户
	public List<UserVo> selectAllUserVo();
	
	//多条件查询  通过用户对象中的 条件查询用户列表
	public List<User> selectUserListByUser(User u);

	public List<User> selectUserListByUserTrim(User u);
	
	//更新用户表
	public void updateSetUser(User u);
	
	//根据id 查询多个用户
	public List<User> selectUserListByIds(Integer[] ids);

	//根据list 中的数据进行查询
	public List<User> selectUserListByList(List<Integer> idList);
	
	//使用 foreach 来处理 包装类
	public List<User> selectUserListByUserVo(UserVo uservo);
}
