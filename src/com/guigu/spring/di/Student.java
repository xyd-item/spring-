package com.guigu.spring.di;

public class Student {
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	private Teacher teacher;

	private Double score;

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String sex, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Student(Integer id, String name, String sex, Double score) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.score = score;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", teacher=" + teacher
				+ ", score=" + score + "]";
	}

}
