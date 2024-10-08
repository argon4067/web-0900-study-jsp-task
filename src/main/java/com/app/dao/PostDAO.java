package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.task.config.TaskConfig;
import com.app.vo.PostVO;

public class PostDAO {
	public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = TaskConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void write(PostVO postVO) {
		sqlSession.insert("post.write", postVO);
	}
	
	public List<PostVO> selectAll() {
		return sqlSession.selectList("post.selectAll");
	}
	
	public Long selectId() {
		return sqlSession.selectOne("post.selectId");
	}
	
	public Optional<PostVO> select(Long id) {
		return Optional.ofNullable(sqlSession.selectOne("post.select", id));
	}
	
	public void update(PostVO postVO) {
		sqlSession.update("post.update", postVO);
	}
	
	public void delete(Long id) {
		sqlSession.delete("post.delete", id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

