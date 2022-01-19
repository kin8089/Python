import java.util.Random;

public class Lotto {
		public int LottoNumCnt;
		Random random = new Random();
		int com[] = new int[6];
		
		public Lotto() {
		}
		public void generateLottoNumbers(){
				for(int i=0; i<6; i++) {
					for(int j=0; j<i; j++) {
						if(com[i]==com[j]) {
							i--;
						}
					}

				}

			}
		
		}



