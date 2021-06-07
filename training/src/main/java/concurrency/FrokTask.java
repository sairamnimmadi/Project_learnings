package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

@SuppressWarnings("serial")

public class FrokTask extends RecursiveAction {
	
	private long Load  = 0;
	
	public FrokTask(long Load) {
		this.Load = Load;
	}

	@Override
	protected void compute() {
		List<FrokTask> subtasks = new ArrayList<FrokTask>();
		subtasks.addAll(createSubtasks());
		
		for(RecursiveAction subtask : subtasks) {
			subtask.fork();
		}
	}
	
	private List<FrokTask> createSubtasks(){
		
		List<FrokTask> subtasks = new ArrayList<FrokTask>();
		
		FrokTask subtask1 = new FrokTask(this.Load/2);
		FrokTask subtask2 = new FrokTask(this.Load/2);
		FrokTask subtask3 = new FrokTask(this.Load/2);
		
		subtasks.add(subtask1);
		subtasks.add(subtask2);
		subtasks.add(subtask3);
		
		return subtasks;
	}	
}
