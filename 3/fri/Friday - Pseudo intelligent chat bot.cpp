#include<bits/stdc++.h>
#include<windows.h>
#include<conio.h>
using namespace std;

void learn(); void listen(); int decide(); void reply(); void readit();
void memorise(); void gotit(); void past(); void emptymsg(); void cleartmem();
void delay(float seconds); void trimTrailing(char * str); void replydecider();
void chcolor(int x, char s); void scolor(int x, string s); void intro(); void typing();

char Base[1000][26][200], msg[250], msga[250], msgb[250], com[250], combase[100][50][25];
int scount=0, wcount=0, lcount=0, jcount[1000], cbcount=-1,ooo=0, chatloop=1;
//Decider variables
int D, dxx, dyy, dii, djj, dcc[1000][3], repcount, repnum;
//Past variables
char pastmem[2][26][250]; int pmloc=0;

//Main Function
int main()
{
    intro();
    system("cls");
    system("color 0F");

    char a=177;
    for(int j=1; j<=4; j++)
    for(int i=4; i<=8; i++)
        {
            chcolor(i*15,a);
        }
    scolor(15," [ Chat bot status: ");
    scolor(2,"ACTIVE ] ");
    for(int j=1; j<=4; j++)
    for(int i=8; i>=4; i--)
        {
            chcolor(i*15,a);
        }
    cout<<endl<<endl;


    learn();
    while (chatloop!=0)
    {
        listen();
        decide();
        reply();
        cleartmem();
    }
}


//Major functions
void learn()
{

    strcpy(msg,"Allah, Can, Do, Anything, there, should, be, no, doubt, about, that! ; Yes! No doubt!");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"system, close, terminate, exit, chat, shut, shut, bye, bye; Goodbye. See you soon, Friday");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"your, name ; I am Friday.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"your, name ; My name is Friday.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"who, you ; I am a chat bot. Would you chat with me?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"who, you ; I am a pseudo intelligent chat bot. Would you chat with me?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"yes, yes; Cool.. Keep talking!");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"yes, yes; Cool.. What else you want to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"no,no; Cool.. Keep talking!");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"no,no; Cool.. What else you want to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"yes, yes; Cool.. Nice to talk to you.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"How, you, doing; Not bad. What about you?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"How, you; I am fine. And you");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Keep, talking; What would you like me to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Keep, talking; You are boring...! ");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Keep, talking,why, how, really, for real; Yes of course. You are.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"my, name ; You must be Feeham.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"my, name, why ; Because Feeham created me.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"my, name, not ; Then you must be his friend or teacher. I can't see you know. I can only guess.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"you, guess ; Yes a little bit. Not so much like you. Let me guess, now you are staring at computer screen");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"you, right ; AI never wrong. What else you want to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"talk, you ; Oh really! I'm honored sir.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"we, start? ; Perhaps with a salam.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Assalamu, Alaikum ; Walaikum assalam");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"you, think; No, I don't. What else you want to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"nice, nice; Thank you. Are you busy?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"nice, nice, no, why; You type so small messages!");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"nice, nice; What are you doing right now?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"fine, fine; Cool. Keep talking?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"talking, you; Wow, I am honored sir.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"chatting, you; Wow, I am honored sir. What would you like to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Good, morning; Same, good morning have a nice day sir.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Hi, Hi; Hello, good morning have a nice day sir.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Hello, Hello; Whats up? How is it going?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Hey, hey; Good morning, how you doing?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Hello, Hello; Hello, good morning have a nice day sir.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"thank, you;I am honored sir. What else would you like to talk about?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"thank, you;You are welcome. Keep talking.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"love, you;Thank you. I don't have feelings otherwise I'd love you too!");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Oh, no;Is there anything wrong?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"I, left, a, message, empty ; Please type something that I understand.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"you, understand; Things.... But, not much like you.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"I, left, a, message, empty ; What? I don't get it.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"I, left, a, message, empty ; Please say something meaningful?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"don't, get it ; Sorry, but did not understand what you said.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Info, Information, country; On which country. I don't know a lot though.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"About,country, Bangladesh; What would you like to know about Bangladesh");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"About,country, India; What would you like to know India");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"GDP,country, About, Bangladesh; 249.7 billion USD (2017)");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"GDP,country, About, India; 2.597 trillion USD (2017)");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"area,country, About, Bangladesh; 147,570 sqkm. Anything else wanna know about Bangladesh?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"area,country, About, India; 3.287 million km sqkm. Anything else wanna know about India?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"population,country, About, Bangladesh; 164.7 million (2017). Anything else?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"population,country, About, India;1.339 billion (2017). Anything else?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"teacher, name; MD ANSARUL ISLAM");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"teacher, name, special, why; Because, you created me for his class.");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"friend, friends, name; Um.... Shuvo");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"friend, name, why; Because, He's your friend");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"friend, name, specially, why; Because, He's your best friend");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"haha, haha, hahaha, hahaha; Is that funny?");
    readit();
    memorise();
    cleartmem();
    strcpy(msg,"Isnt, funny; Yes, it supposed to be.");
    readit();
    memorise();
    cleartmem();


}
void listen()
{
    int xx,yy=0,zz=0,ll;
    //Set where to save command
    //Then clears temporary command collector
    djj=0; cbcount++;
    cleartmem();
    char a=177;
    for(int i=4; i<=8; i++)
        {
            chcolor(i,a);
        }
    chcolor(15,'>');
    chcolor(15,'>');
    cout<<" ";
    gets(com);
    trimTrailing(com);
    if(strcmp(com,"")==0)
    strcpy(com,"ABC DEF GHI JKL MNO PQR STU VWXYZ");
    ll=strlen(com);
    for (xx=0; xx<=ll; xx++)
    {
        if(((com[xx]>='A')&&(com[xx]<='Z'))||((com[xx]>='a')&&(com[xx]<='z'))||((com[xx]>='0')&&(com[xx]<='9')))
        {
            if((com[xx]>='A')&&(com[xx]<='Z'))
                combase[cbcount][yy][zz]=com[xx]+32;
            else
                combase[cbcount][yy][zz]=com[xx];
            zz++;
        }
        else if(com[xx]==' ')
        {
            zz=0;
            yy++;
            djj++;
        }
    }
//Saved command in exact way
}
int decide()
{
//Finding valid bases
    for (dxx=0; dxx<=scount-1; dxx++)
    {
        ooo=0;
        for (dyy=0; dyy<=23; dyy++)
        {
            for(dii=0; dii<=djj; dii++)
                if (strcmp(Base[dxx][dyy],combase[cbcount][dii]) == 0)
                    { ooo++; }
        }
        dcc[dxx][0]=dxx;
        dcc[dxx][1]=ooo;
        dcc[dxx][2]=ooo-jcount[dxx]+10;
    }
    dxx=0; dyy=0; dii=0; djj=0;
    //Sorting
    for(dii=0; dii<=1000; dii++)
    {int a=dcc[dii][0], b=dcc[dii][1], c=dcc[dii][2];
            for(djj=dii; djj<=1000; djj++)
                {if(dcc[djj][1]>b)
                    { a=dcc[djj][0]; b=dcc[djj][1]; c=dcc[djj][2]; dyy=djj; }}
        int tempa=dcc[dii][0], tempb=dcc[dii][1], tempc=dcc[dii][2];
        dcc[dii][0]=a; dcc[dii][1]=b; dcc[dii][2]=c;
        dcc[dyy][0]=tempa; dcc[dyy][1]=tempb; dcc[dyy][2]=tempc;
        }

    if(dcc[0][1]==0) emptymsg();
    else if(dcc[0][1]==1) past();
    else
    {
        for(dii=0; dii<=100; dii++)
            {
                if(dcc[dii][1]>dcc[dii+1][1])
                    {
                        repcount=dii;
                        dii=101;
                    }
    }
    dxx=55;
    for(dii=0; dii<repcount; dii++)
        {if(dcc[dii][2]>dcc[dii+1][2])
            {
                dxx=dii;
                repcount=dxx-100;
        }}
        gotit();
    }
}
void reply()
{
    if(dcc[repnum][0]==1)
        chatloop=0;
    pmloc=0;
    char a=177;
    for(int i=4; i<=8; i++)
        {
            chcolor(i,a);
        }
    chcolor(15,'>');
    chcolor(15,'>');
    cout<<"";
        for (int i=2; i>0; i--) {

        std::cout << " Typing\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " tYping\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " tPping\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " typIng\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " typiNg\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " typinG\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " typing.\b\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " typing..\b\b\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
        std::cout << " typing...\b\b\b\b\b\b\b\b\b\b" << std::flush;
        Sleep(i*100);
    }
    cout<<"\r";
    cout<<"\r";
for(int i=4; i<=8; i++)
        {
            chcolor(i*30,a);
        }
    chcolor(15,'>');
    chcolor(15,'>');
    cout<<"";

    printf("%s\n",Base[dcc[repnum][0]][25]);

}


//Minor functions
void readit()
{

    int ii, cc, ll;
    ll=strlen(msg);

    //Taking tags inside msga!
    for(ii=0; ii<=ll; ii++)
    {
        if(msg[ii]==';')
        {
            cc=ii+1;
            ii=ll+1;
        }
        else
        msga[ii]=msg[ii];
    }

    //Taking reply inside msgb!
    for(ii=cc; ii<=ll; ii++)
    {
        msgb[ii-cc]=msg[ii];
    }

}
void memorise()
{
    int ii=scount, jj, kk, cc;

    //Storing value in last array!
    cc=strlen(msgb);
    for(kk=0; kk<=cc; kk++)
    {
       Base[scount][25][kk]=msgb[kk];
    }

    //Storing value in first arrays!
    cc=strlen(msga);
    int xx=0, ss=0;
    for(jj=0; jj<=23; jj++)
    {
        for(kk=xx; kk<=cc; kk++)
        {
            if(kk==cc)
            {
                goto jend;
            }
            if(msga[kk]==',')
            {
                Base[scount][jj][kk]='\0';
                xx=kk+1;
                kk=cc+1;
            }

            else if (((msga[kk]>='A')&&(msga[kk]<='Z'))||((msga[kk]>='a')&&(msga[kk]<='z'))||((msga[kk]>='0')&&(msga[kk]<='9')))
            {
                if((msga[kk]>='A')&&(msga[kk]<='Z'))
              Base[scount][jj][ss]=msga[kk]+32;
            else
              Base[scount][jj][ss]=msga[kk];
              ss++;
            }
        }
        ss=0;

    }
jend:
    {
        jcount[scount]=jj+1;
    }
    scount++;
}
void gotit()
{
    for(int H=0; H<=25; H++)
    {
        strcpy(pastmem[pmloc][H],combase[cbcount][H]);
    }
    if(repcount<0)
        repnum=repcount+100;
    else
    {
        srand(time(0));
        repnum=(rand()%(repcount+1));
    }
}
void past()
{
    pmloc++;
    for(int HH=0; HH<=25; HH++)
    {
        strcat(com," ");
        strcat(com,pastmem[0][HH]);
    }
    trimTrailing(com);

    int xx,yy=0,zz=0,ll;
    djj=0;
    cbcount++;
    ll=strlen(com);
    for (xx=0; xx<=ll; xx++)
    {
        if(((com[xx]>='A')&&(com[xx]<='Z'))||((com[xx]>='a')&&(com[xx]<='z'))||((com[xx]>='0')&&(com[xx]<='9')))
            {
                if((com[xx]>='A')&&(com[xx]<='Z'))
                    combase[cbcount][yy][zz]=com[xx]+32;
                else
                    combase[cbcount][yy][zz]=com[xx];
                zz++;
            }
        else if(com[xx]==' ')
        {
            zz=0;
            yy++;
            djj++;
        }

    }
//Saved command in exact way

decide();
}
void emptymsg()
{
    pmloc++;
    // IF A MESSAGE IS EMPTY OR ITS CONTENT DOESN'T MATCH IN ENTIRE BASE THEN THIS FUNCTION IS CALLED WHICH IS ACTUALLY AN "REACT FOR EMPTY MESSAGE" FUNCTION!
    int xx,yy=0,zz=0,ll;
    //Set where to save command
    //Then clears temporary command collector
    djj=0;
    cbcount++;
    cleartmem();
    strcpy(com,"I left a message empty");
    ll=strlen(com);
    for (xx=0; xx<=ll; xx++)
    {
        if(((com[xx]>='A')&&(com[xx]<='Z'))||((com[xx]>='a')&&(com[xx]<='z'))||((com[xx]>='0')&&(com[xx]<='9')))
        {
            if((com[xx]>='A')&&(com[xx]<='Z'))
                combase[cbcount][yy][zz]=com[xx]+32;
            else
                combase[cbcount][yy][zz]=com[xx];
            zz++;
        }
        else if(com[xx]==' ')
        {
            zz=0;
            yy++;
            djj++;
        }

        }
//Saved command in exact way
decide();
}


//Extra functions
void cleartmem()
{
    strcpy(msga,"                                                                                                                                                                                                        ");
    strcpy(msgb,"                                                                                                                                                                                                        ");
    strcpy(com,"                                                                                                                                                                                                        ");
}
void delay(float seconds)
{
    time_t t = time(NULL);
    while (difftime(time(NULL), t) < seconds) ;
}
void trimTrailing(char * str)
{
    int index, i;
    /* Set default index */
    index = -1;
    /* Find last index of non-white space character */
    i = 0;
    while(str[i] != '\0')
    {
        if(str[i] != ' ' && str[i] != '\t' && str[i] != '\n')
        {
            index= i;
        }
        i++;
    }
    /* Mark next character to last non-white space character as NULL */
    str[index + 1] = '\0';
}
void chcolor(int x, char s)
{
    HANDLE color=GetStdHandle(STD_OUTPUT_HANDLE); //just once
    SetConsoleTextAttribute(color, x);
    cout<<s;
}
void scolor(int x, string s)
{
    HANDLE color=GetStdHandle(STD_OUTPUT_HANDLE); //just once
    SetConsoleTextAttribute(color, x);
    cout<<s;
}
void intro()
{
    int i;
    char a=177;
    for(i=0; i<=65; i++)
        {
            chcolor(i,a);
        }
    cout<<endl;
    for(i=0; i<=13; i++)
        {
            chcolor(i,a);
        }
    scolor(15,"       Welcome to Friday Chat Bot     ");
    for(i=0; i<=13; i++)
        {
            chcolor(i,a);
        }
    cout<<endl;
    for(i=0; i<=13; i++)
        {
            chcolor(i,a);
        }
    scolor(4,"          Press enter to start        ");
    for(i=0; i<=13; i++)
        {
            chcolor(i,a);
        }
    cout<<endl;
    for(i=0; i<=65; i++)
        {
            chcolor(i,a);
        }

    cout<<endl<<endl;
    scolor(15,"             INSTRUCTIONS:\n                 Use any uppercase of lowercase latter.\n                 Do not make spelling mistake!\n\n");
    for(i=0; i<=65; i++)
        {
            chcolor(i,a);
        }
    cout<<endl<<endl;
    getch();
}
void typing()
{
        for (int i=2; i>0; i--) {

        std::cout << "\b\b\b\b\b\b\b\b\b\bTyping   " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btYping   " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btPping   " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btypIng   " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btypiNg   " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btypinG   " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btyping.  " ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btyping.." ;
        Sleep(i*100);
        std::cout << "\b\b\b\b\b\b\b\b\b\btyping..." ;
        Sleep(i*100);
    }
    cout<<"\r";
    cout<<"\r";
}
