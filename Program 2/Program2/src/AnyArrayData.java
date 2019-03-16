
public class AnyArrayData implements Container{
	/*this class just creates array of any kind and returns an iterator by overriding the getIterator of Container Interface.
	*This class hides the implementation of iIterator.
	*/
	private Object arr[];
	private int iter = -1;
	public void makingArray(Object[] array) {
		arr = array;
	}
	
	@Override
	public iIterator getIterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements iIterator{
		//this class implements iIterator and is nested so that its implementation is hidden
		
		@Override
		public Object First() {
			return arr[1];
		}

		@Override
		public Object Next() {
			iter++;
			return arr[iter];
			
		}

		@Override
		public boolean isDone() {
			if(iter==arr.length-1) {
				return true;
			}
			else
				return false;
		}

		@Override
		public Object CurrentItem() {
			return arr[iter];
		}
		
	}
	
}
