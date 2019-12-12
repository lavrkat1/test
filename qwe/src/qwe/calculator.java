package qwe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	float result;
    JButton buttonResult = new JButton("результат");

    public calculator() {
        buttonResult.setEnabled(false); 
        add(buttonResult, BorderLayout.SOUTH); 
        JPanel radioPanel = new JPanel(new GridLayout(5, 1)); // РћРїСЂРµРґРµР»СЏРµРј СЂР°СЃРїРѕР»РѕР¶РµРЅРёРµ СЌР»РµРјРµРЅС‚РѕРІ
        radioPanel.setBackground(new Color(207, 207, 207)); //РЈСЃС‚Р°РЅР°РІР»РёРІР°РµРј С†РІРµС‚ РїР°РЅРµР»РµР№
        radioPanel.setLayout((LayoutManager) new BoxLayout(radioPanel, BoxLayout.Y_AXIS)); // РЈРєР°Р·С‹РІР°РµРј СЂР°СЃРїРѕР»РѕР¶РµРЅРёРµ СЃС‚СЂРѕРє
        setBounds(300, 300, 300, 300); //РћРїСЂРµРґРµР»СЏРµРј СЂР°Р·РјРµСЂ РѕРєРЅР°   
        add(radioPanel, BorderLayout.CENTER);// РЈРєР°Р·С‹РІР°РµРј СЂР°СЃРїРѕР»РѕР¶РµРЅРёРµ СЃС‚СЂРѕРє
        final JTextField month = new JTextField(); //РћР±СЉСЏРІР»СЏРµРј РїРѕР»СЏ РІРІРѕРґР°
        final JTextField stavka = new JTextField(); //РћР±СЉСЏРІР»СЏРµРј РїРѕР»СЏ РІРІРѕРґР°
        final JTextField sum = new JTextField(); //РћР±СЉСЏРІР»СЏРµРј РїРѕР»СЏ РІРІРѕРґР°
       
        JLabel monthtext = new JLabel("количеств месяцев:"); // Р—Р°РґР°РµРј РЅР°Р·РІР°РЅРёРµ СЃС‚СЂРѕРє
        JLabel stavkatext = new JLabel("Ставка по кредиту(%):"); // Р—Р°РґР°РµРј РЅР°Р·РІР°РЅРёРµ СЃС‚СЂРѕРє
        JLabel sumtext = new JLabel("сумма кредита:"); // Р—Р°РґР°РµРј РЅР°Р·РІР°РЅРёРµ СЃС‚СЂРѕРє
        //Р”РѕР±Р°РІР»СЏРµРј С‚РµРєСЃС‚РѕРІС‹Рµ СЃС‚СЂРѕРєРё Рё РїРѕР»СЏ РґР»СЏ РІРІРѕРґР°
        radioPanel.add(monthtext); 
        radioPanel.add(month); 
        radioPanel.add(stavkatext);
        radioPanel.add(stavka); 
        radioPanel.add(sumtext);
        radioPanel.add(sum); 
       
        month.addKeyListener(new KeyAdapter() { //Р”РѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЏ РЅР° РїРѕР»Рµ РґР»СЏ РІРІРѕРґР°
        	public void keyTyped(KeyEvent e) {
        		char c = e.getKeyChar();
        		if ( ((c < '0') || (c > '9'))) {
        			e.consume(); // Р�РіРЅРѕСЂРёРј РІРІРµРґРµРЅРЅС‹Рµ Р±СѓРєРІС‹ Рё РїСЂРѕР±РµР»
        		}
        		if (month.getText().length() >= 2){
                	 JOptionPane.showMessageDialog(null, "максимальное количество символов 2", "неправильный ввод",JOptionPane.WARNING_MESSAGE );
                 } //РќРµ РґР°РµРј РїРѕР»СЊР·РѕРІР°С‚РµР»СЋ РІРІРѕРґРёС‚СЊ Р±РѕР»СЊС€Рµ 2 СЃРёРјРІРѕР»РѕРІ РІ СЃС‚СЂРѕРєСѓ
        	}
        });
        stavka.addKeyListener(new KeyAdapter() {
        	public void keyTyped(KeyEvent e) {
        		char c = e.getKeyChar();
        		if ( ((c < '0') || (c > '9'))) {
        			e.consume(); // Р�РіРЅРѕСЂРёСЂСѓРµРј РІРІРµРґРµРЅРЅС‹Рµ Р±СѓРєРІС‹ Рё РїСЂРѕР±РµР»
        		}
        		if (stavka.getText().length() >= 2){
        			JOptionPane.showMessageDialog(null, "максимальное количество символов 2", "неправильный ввод",JOptionPane.WARNING_MESSAGE );
        		} //РќРµ РґР°РµРј РїРѕР»СЊР·РѕРІР°С‚РµР»СЋ РІРІРѕРґРёС‚СЊ Р±РѕР»СЊС€Рµ 2 СЃРёРјРІРѕР»РѕРІ РІ СЃС‚СЂРѕРєСѓ
        	}
        });
        sum.addKeyListener(new KeyAdapter() {
        	public void keyTyped(KeyEvent e) {
        		char c = e.getKeyChar();
        		if ( ((c < '0') || (c > '9'))) {
        			e.consume(); // Р�РіРЅРѕСЂРёСЂСѓРµРј РІРІРµРґРµРЅРЅС‹Рµ Р±СѓРєРІС‹ Рё РїСЂРѕР±РµР»
        		}
        		
        	}
        });

        JButton calculate = new JButton("Расчет"); 
        calculate.setBackground(new Color(255, 128, 0)); //Р—Р°РґР°РµРј С†РІРµС‚ РєРЅРѕРїРєРё
        calculate.addActionListener(new ActionListener() { //Р”РѕР±Р°РІР»СЏРµРј СЃР»СѓС€Р°С‚РµР»СЏ РЅР° РєРЅРѕРїРєСѓ
            public void actionPerformed(ActionEvent e) {
            	Float s = Float.parseFloat((sum.getText())); //РџСЂРµРѕР±СЂР°Р·РѕРІС‹РІР°РµРј РІРІРµРґРµРЅРЅС‹Рµ РІ РїРѕР»Рµ Р·РЅР°С‡РµРЅРёСЏ РІ С‚РёРї РґР°РЅРЅС‹С… float
            	Float t = Float.parseFloat((stavka.getText())); //РџСЂРµРѕР±СЂР°Р·РѕРІС‹РІР°РµРј РІРІРµРґРµРЅРЅС‹Рµ РІ РїРѕР»Рµ Р·РЅР°С‡РµРЅРёСЏ РІ С‚РёРї РґР°РЅРЅС‹С… float
                Float m = Float.parseFloat((month.getText())); //РџСЂРµРѕР±СЂР°Р·РѕРІС‹РІР°РµРј РІРІРµРґРµРЅРЅС‹Рµ РІ РїРѕР»Рµ Р·РЅР°С‡РµРЅРёСЏ РІ С‚РёРї РґР°РЅРЅС‹С… float
                float result= Result(s,t,m); //РџРµСЂРµРґР°РµРј РґР°РЅРЅС‹Рµ РІ РјРµС‚РѕРґ РґР»СЏ РІС‹С‡РёСЃР»РµРЅРёСЏ
                buttonResult.setText(Float.toString(result));
            }
        });

        buttonResult.setBackground(new Color(255, 255, 255)); //РЈСЃС‚Р°РЅР°РІР»РёРІР°РµРј С†РІРµС‚ РїР°РЅРµР»Рё
        radioPanel.add(calculate); 
        setVisible(true); //Р”РµР»Р°РµРј РѕРєРЅРѕ РІРёРґРёРјС‹Рј
    }



public float Result(float sum,float stavka,float month) { //Р—Р°РґР°РµРј РїРµСЂРµРјРµРЅРЅС‹РµРё РјРµС‚РѕРґ
float result = (sum/month)+((sum/month)*(stavka/100)); //Р¤РѕСЂРјСѓР»Р° РїРѕРґСЃС‡РµС‚Р°
return result; //Р’РѕР·РІСЂР°С‰Р°РµРј Р·РЅР°С‡РµРЅРёРµ
}

public static void main(String[] args) {
                new calculator();
        }



//РџРµСЂРµРІРѕРґРёРј РІ С„РѕСЂРјР°С‚ РІРёРґР° string
private static String format(int i) {
    String result = String.valueOf(i);
    if (result.length() == 1) {
        result = "0" + result;
    }
    return result; //Р’РѕР·РІСЂР°С‰Р°РµРј Р·РЅР°С‡РµРЅРёРµ
}

}