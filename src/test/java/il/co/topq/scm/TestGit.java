package il.co.topq.scm;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.junit.Test;

public class TestGit {
	
	@Test
	public void testGit() throws IOException {
		Repository newlyCreatedRepo = FileRepositoryBuilder.create(
			    new File("/tmp/new_repo/.git"));
		
	}
	
}
