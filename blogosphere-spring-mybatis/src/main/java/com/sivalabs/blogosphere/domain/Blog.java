/**
 * 
 */
package com.sivalabs.blogosphere.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author skatam
 *
 */
public class Blog 
{
	private Integer blogId;
	private String blogName;
	//private Integer ownerId;
	private User owner;
	private Date createdOn;
	private Date updatedOn;
	private List<Post> posts = null;
	
	public Integer getBlogId() {
		return blogId;
	}
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	
	public Date getCreatedOn()
	{
		return createdOn;
	}
	public void setCreatedOn(Date createdOn)
	{
		this.createdOn = createdOn;
	}
	public List<Post> getPosts() {
		if(posts == null){
			posts = new ArrayList<Post>();
		}
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public User getOwner()
	{
		return owner;
	}
	public void setOwner(User owner)
	{
		this.owner = owner;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
