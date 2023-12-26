package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_getBoard_List_Test {

	public static void main(String[] args) {
		
		// BoardDAO getBoardList(dto) 메소드 테스트
		
		// 1. BoardDTO 객체 생성
		BoardDTO dto = new BoardDTO();
		
		
		// 2. BoardDAO 객체 생성 후 메소드 호출
		BoardDAO dao = new BoardDAO();
		dao.getBoardList(dto);
		
		
		
	}

}
