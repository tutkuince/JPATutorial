package part03.dao;

import java.util.List;

import part03.model.Project;

public interface ProjectDAO {
	public void insertProject(Project project);
	public Project getProjectById(int id);
	public List<Project> getProjectList();
	public void deleteProject(int id);
}
