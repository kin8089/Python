
public class ExceptionTest {
	class RangeBoundsException extends Exception {
		private double last_tall = 161;
		public RangeBoundsException(String message){
		super(message);
	}
		public double get_last_tall() {
		return last_tall;	
	    }
	}

		public void checkTall(double tall) throws ExceptionTest.RangeBoundsException{
					if(tall > 180) {
						throw new RangeBoundsException("��ȿ�������� �����ϴ�");
					}
					else if(tall <130) {
						throw new RangeBoundsException("��ȿ�������� �����ϴ�");
					}
				
		}
		
		public double averageTall(double[] talls) {
			double sum;
			
			sum = 0; for (double n : talls) { sum += n; }
			double average = sum / talls.length;
			return average;
		}
		
		public static void main(String[] args){
			double[]  middle_talls = new double[] { 152,155.5,148.5,192,160,162,165,168,115,159,157,170,171};
			ExceptionTest test = new ExceptionTest();
			for (int i=0;i<middle_talls.length;i++) {
				try {
					test.checkTall(middle_talls[i]);
				}catch(RangeBoundsException e) {
					System.err.println(e.getMessage());
					middle_talls[i] = e.get_last_tall();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}//for end
			System.out.printf("������ ���л� ��� Ű : %1$.2f" ,test.averageTall(middle_talls));
		}
	}