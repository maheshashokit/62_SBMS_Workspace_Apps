package com.ashokit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer>{
	
	
	@Query(value = "select p.post_id,p.post_title,c.comment_info from ashokit_posts p join ashokit_comments c on p.post_id=c.post_id where p.post_id=?", nativeQuery = true)
	public List<Object[]> getData(int postId);

}
