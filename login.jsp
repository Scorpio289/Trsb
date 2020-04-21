<html>
<body>
<FORM id=vForm action='LoginC1' name=vForm method=post>
<DIV class=logoicon></DIV>
<DIV class=main_top>
    <DIV CLASS="title_note1 red link" id=login_err>
    </DIV>
</DIV>

<DIV class=main_cen>
<P class=title1>Login My Blog</P>
<UL class=mainlogin>
    <LI>
        <DIV class="ml_l f14">username:</DIV>
        <DIV class=ml_r>
            <DIV class=inputbox>
                <SPAN class=input>
                    <CITE>
                        <INPUT id=username tabIndex=0 alt=username:non/length{4-64}/errArea{usernameErr} maxLength=64 name=username autocomplete="off">
                    </CITE>
                </SPAN>
            </DIV>
            <SPAN class="inputacc link"></SPAN>
            <SPAN class="red link" id=usernameErr></SPAN>
        </DIV>
    <LI>
        <DIV class="ml_l f14">password: </DIV>
        <DIV class=ml_r>
            <DIV class=inputbox>
                <SPAN class=input>
                    <CITE>
                        <INPUT id=password tabIndex=1 type=password maxLength=32 name=passwd>
                    </CITE>
                </SPAN>
            </DIV>
            <SPAN class="inputacc link"><A>findback my password</A></SPAN>
            <SPAN class="red link" id=passwordErr></SPAN>
        </DIV>
    
    <LI>
        <DIV class=ml_l></DIV>
        <DIV class=ml_r>
            <DIV class=inputacc>
                <LABEL for=savestate>
                    <INPUT  id=savestate onclick="document.getElementById('savestate_tip').style.display=this.checked?'block':'none';" tabIndex=3 type=checkbox name=savestate>
                    &nbsp;
                    remember the login state
                </LABEL>
            </DIV>
            <DIV class="inputtxt zi_9" id=savestate_tip style="DISPLAY: none">
                 tips: cancel this option if public！
             </DIV>
        </DIV>
        <LI>
            <DIV class=ml_l></DIV>
            <DIV class=ml_r>
                <INPUT class=btn_submit tabIndex=4 type=submit value="LOGIN">
            </DIV>
            <DIV class=clearit></DIV>
        </LI>
</UL>
</DIV>
</body>
</html>




    
