package il.co.topq.scm;

import java.io.File;
import java.util.List;

import jsystem.extensions.sourcecontrol.SourceControlException;
import jsystem.extensions.sourcecontrol.SourceControlI;
import jsystem.framework.scenario.Scenario;

public class GitPlugin implements SourceControlI{

	@Override
	public void connect(String repoPath, String userName, String password) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initWorkingCopy() throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWorkingCopyInitialize() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Status getScenarioStatus(Scenario scenario) throws SourceControlException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addScenario(Scenario scenario) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitScenario(Scenario scenario) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateScenario(Scenario scenario) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revertScenario(Scenario scenario) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Status getSutStatus(String sutName) throws SourceControlException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSut(String sutName) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitSut(String sutName) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSut(String sutName) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revertSut(String sutName) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supportMakeWritable() throws SourceControlException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void makeWritable(List<File> files) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveFile(File source, File destination) throws SourceControlException {
		// TODO Auto-generated method stub
		
	}

}
