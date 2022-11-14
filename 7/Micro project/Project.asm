INCLUDE 'EMU8086.INC'

ORG 100H
    CALL INTRO
    CLOSE: 
RET 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INTRO PROC
    PRINTN
    PRINT 'Chose a converter type'
    PRINTN
    CALL INDEX
    CALL INPUT
    MOV BH, CL ;; BH IS BEING USED FOR CONVERTER TYPES
    CALL INTRO_CONT
    RET
INTRO ENDM
INTRO_CONT PROC
    CMP BH, 1
    JE CALL INDEX_LENGTH  
    CMP BH, 2
    JE CALL INDEX_TEMP
    CMP BH, 3
    JE CALL INDEX_CURRENCY
    CMP BH, 4
    JE CALL INDEX_SPEED
    CMP BH, 5
    JE CALL INDEX_WEIGHT
    RET
INTRO_CONT ENDM

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INPUT PROC
    PRINTN 
    PRINT '=>> '  
    CALL SCAN_NUM   
    PRINTN
    PRINTN
    RET
INPUT ENDM

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INDEX PROC
    PRINTN 
    PRINT '[1] Length'
    PRINTN
    PRINT '[2] Temperature'
    PRINTN 
    PRINT '[3] Currency'
    PRINTN
    PRINT '[4] Speed'
    PRINTN 
    PRINT '[5] Weight'
    RET
INDEX ENDM 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INDEX_LENGTH PROC
    PRINTN 
    PRINT '[1]km to mile'
    PRINTN
    PRINT '[2]mile to km'
    PRINTN
    PRINT '[3]m to ft'
    PRINTN
    PRINT '[4]ft to m'
    PRINTN
    PRINT '[5]m to yd'
    PRINTN
    PRINT '[6]yd to m'
    PRINTN
    PRINT '[7]cm to in'
    PRINTN 
    PRINT '[8]in to cm'
    PRINTN
    PRINT '[9]pc to km'
    PRINTN
    PRINT '[10]ly to km'
    PRINTN
    PRINT '[11]au to km'
    PRINTN
    PRINT '[12]ly to au'
    PRINTN
    PRINT '[13]ly to pc'
    PRINTN
    PRINT '[14]au to pc'
         
    CALL INPUT
    MOV BL, CL ;; BL IS BEING USED FOR CONVERTER 
    CALL CONVERT
    RET
INDEX_LENGTH ENDM 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INDEX_TEMP PROC
    PRINTN 
    PRINT '[15]C to F'
    PRINTN
    PRINT '[16]C to K'
    PRINTN
    PRINT '[17]C to R'
    PRINTN
    PRINT '[18]F to C'
    PRINTN
    PRINT '[19]F to K'
    PRINTN
    PRINT '[20]K to C'
    PRINTN
    PRINT '[21]R to C'
         
    CALL INPUT
    MOV BL, CL ;; BL IS BEING USED FOR CONVERTER 
    CALL CONVERT
    RET
INDEX_TEMP ENDM 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INDEX_CURRENCY PROC
    PRINTN 
    PRINT '[22] BDT to USD'
    PRINTN
    PRINT '[23] USD to BDT'
    PRINTN
    PRINT '[24] BDT to EU'
    PRINTN
    PRINT '[25] EU to BDT'
    PRINTN
    PRINT '[26] BDT to INR'
    PRINTN
    PRINT '[27] INR to BDT'
    PRINTN
    PRINT '[28] BDT to CN'
    PRINTN
    PRINT '[29] CN to BDT'
         
    CALL INPUT
    MOV BL, CL ;; BL IS BEING USED FOR CONVERTER
    CALL CONVERT
    RET
INDEX_CURRENCY ENDM 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INDEX_SPEED PROC
    PRINTN 
    PRINT '[30] KMPH to MPH'
    PRINTN
    PRINT '[31] MPH to KMPH'
    PRINTN
    PRINT '[32] KMPH to m/s'
    PRINTN
    PRINT '[33] m/s to KMPH'
    PRINTN
    PRINT '[34] m/s to Ft/s'
    PRINTN
    PRINT '[35] Ft/s to m/s'
         
    CALL INPUT
    MOV BL, CL ;; BL IS BEING USED FOR CONVERTER
    CALL CONVERT
    RET
INDEX_SPEED ENDM 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

INDEX_WEIGHT PROC
    PRINTN 
    PRINT '[36] Ounce to Gram'
    PRINTN
    PRINT '[37] Gram to Ounce'
    PRINTN
    PRINT '[38] KG to Lb'
    PRINTN
    PRINT '[39] Lb to KG'
         
    CALL INPUT
    MOV BL, CL ;; BL IS BEING USED FOR CONVERTER
    CALL CONVERT
    RET
INDEX_WEIGHT ENDM              

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

CONVERT PROC
                   
    CMP BL, 1
    JE CALL C1

	CMP BL, 2
	JE CALL C2

	CMP BL, 3
	JE CALL C3

	CMP BL, 4
	JE CALL C4

	CMP BL, 5
	JE CALL C5

	CMP BL, 6
	JE CALL C6

	CMP BL, 7
	JE CALL C7

	CMP BL, 8
	JE CALL C8

	CMP BL, 9
	JE CALL C9

	CMP BL, 10
	JE CALL C10

	CMP BL, 11
	JE CALL C11

	CMP BL, 12
	JE CALL C12

	CMP BL, 13
	JE CALL C13

	CMP BL, 14
	JE CALL C14

	CMP BL, 15
	JE CALL C15

	CMP BL, 16
	JE CALL C16

	CMP BL, 17
	JE CALL C17

	CMP BL, 18
	JE CALL C18

	CMP BL, 19
	JE CALL C19

	CMP BL, 20
	JE CALL C20

	CMP BL, 21
	JE CALL C21

	CMP BL, 22
	JE CALL C22

	CMP BL, 23
	JE CALL C23

	CMP BL, 24
	JE CALL C24

	CMP BL, 25
	JE CALL C25

	CMP BL, 26
	JE CALL C26

	CMP BL, 27
	JE CALL C27

	CMP BL, 28
	JE CALL C28

	CMP BL, 29
	JE CALL C29

	CMP BL, 30
	JE CALL C30

	CMP BL, 31
	JE CALL C31

	CMP BL, 32
	JE CALL C32

	CMP BL, 33
	JE CALL C33

	CMP BL, 34
	JE CALL C34

	CMP BL, 35
	JE CALL C35

	CMP BL, 36
	JE CALL C36

	CMP BL, 37
	JE CALL C37

	CMP BL, 38
	JE CALL C38

	CMP BL, 39
	JE CALL C39

    RET
    CONVERT ENDM
                      
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

RESULT PROC
    CALL PRINT_NUM
    MOV AX, DX    
    PRINT '.'
    MOV BL, CL
    MOV BH, CH
    CALL PRINT_NUM
    CALL FINISH
    RET
RESULT ENDM

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
AGAIN PROC
    CALL CONVERT
    RET
AGAIN ENDM

FINISH PROC
    PRINTN
    PRINT '(1)AGAIN'
    PRINTN
    PRINT '(2)OPTIONS'
    PRINTN
    PRINT '(3)EXIT'
    PRINTN
    CALL INPUT
    CMP CX, 1
    JE CALL AGAIN
    CMP CX, 2
    JE CALL OPTIONS
    CMP CX, 3
    JE CLOSE 
    RET
FINISH ENDM

OPTIONS PROC
    PRINT '(1)CONVERT DIFFERENT UNITS'
    PRINTN
    PRINT '(2)BACK TO CONVERTER TYPE'
    CALL INPUT  
    CMP CX, 1
    JE CALL INTRO_CONT
    CMP CX, 2
    JE CALL INTRO
    RET
OPTIONS ENDM 

;;;;;;;;;;;;;;;;;;;;;;;;;;;

C1 PROC 
    PRINT 'Length in km: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 621
    mul bx
    mov bx, 1000
    div bx
    PRINTN
    PRINT 'Length in mile: '
    CALL RESULT
    RET    
C1 ENDM


C2 PROC 
    PRINT 'Length in mile: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 160
    mul bx
    mov bx, 100
    div bx
    PRINTN
    PRINT 'Length in km: '
    CALL RESULT
    RET    
C2 ENDM


C3 PROC 
    PRINT 'Length in Meter: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 328
    mul bx
    mov bx, 100
    div bx
    PRINTN
    PRINT 'Length in ft: '
    CALL RESULT
    RET    
C3 ENDM


C4 PROC 
    PRINT 'Length in ft: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 100
    mul bx
    mov bx, 304
    div bx 
    PRINTN
    PRINT 'Length in Meter: '
    CALL RESULT
    RET    
C4 ENDM


C5 PROC 
    PRINT 'Length in Meter: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 1093
    mul bx
    mov bx, 1000
    div bx
    PRINTN
    PRINT 'Length in yd: '
    CALL RESULT
    RET    
C5 ENDM


C6 PROC 
    PRINT 'Length in yd: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 914
    mul bx
    mov bx, 1000
    div bx
    PRINTN
    PRINT 'Length in Meter: '
    CALL RESULT
    RET    
C6 ENDM


C7 PROC 
    PRINT 'Length in CM: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 393
    mul bx
    mov bx, 1000
    div bx
    PRINTN
    PRINT 'Length in inch: '
    CALL RESULT
    RET    
C7 ENDM


C8 PROC 
    PRINT 'Length in inch: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 254
    mul bx
    mov bx, 100
    div bx
    PRINTN
    PRINT 'Length in CM: '
    CALL RESULT
    RET    
C8 ENDM


C9 PROC 
    PRINT 'Length in pc: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 308
    mul bx
    mov bx, 10
    div bx
    PRINTN
    PRINT 'Length in (trilion) km: '
    CALL RESULT
    RET    
C9 ENDM


C10 PROC 
    PRINT 'Length in ly: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 946
    mul bx
    mov bx, 100
    div bx
    PRINTN
    PRINT 'Length in (trilion) km: '
    CALL RESULT
    RET    
C10 ENDM


C11 PROC 
    PRINT 'Length in au: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 149
    mul bx
    PRINTN
    PRINT 'Length in (milion) km: '
    CALL RESULT
    RET    
C11 ENDM


C12 PROC 
    PRINT 'Length in ly: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 63
    mul bx
    PRINTN
    PRINT 'Length in (thousand) au: '
    CALL RESULT
    RET    
C12 ENDM


C13 PROC 
    PRINT 'Length in ly: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 307
    div bx
    PRINTN
    PRINT 'Length in pc: '
    CALL RESULT
    RET    
C13 ENDM


C14 PROC 
    PRINT 'Length in au: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 484
    mul bx
    mov bx, 10
    div bx
    PRINTN
    PRINT 'Length in (milion) pc: '
    CALL RESULT
    RET    
C14 ENDM  

;;;;;;;;;;;;;;;;;;;;;;;;;;;

C15 PROC 
    PRINT 'Temp in C: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 9
    mul bx
    mov bx, 5
    div bx
    add ax, 32
    PRINTN
    PRINT 'Temp in F: '
    CALL RESULT
    RET    
C15 ENDM


C16 PROC 
    PRINT 'Temp in C: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    add ax, 273
    PRINTN
    PRINT 'Temp in K: '
    CALL RESULT
    RET    
C16 ENDM


C17 PROC 
    PRINT 'Temp in C: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    mov bx, 9
    mul bx
    mov bx, 5
    div bx
    add ax, 491
    add dx, 67
    PRINTN
    PRINT 'Temp in R: '
    CALL RESULT
    RET    
C17 ENDM


C18 PROC 
    PRINT 'Temp in F: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    sub ax, 32
    mov bx, 5
    mul bx
    mov bx, 9
    div bx
    PRINTN
    PRINT 'Temp in C: '
    CALL RESULT
    RET    
C18 ENDM


C19 PROC 
    PRINT 'Temp in F: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    sub ax, 32
    mov bx, 5
    mul bx
    mov bx, 9
    div bx
    add ax, 273
    PRINTN
    PRINT 'Temp in K: '
    CALL RESULT
    RET    
C19 ENDM


C20 PROC 
    PRINT 'Temp in K: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    sub ax, 273
    PRINTN
    PRINT 'Temp in C: '
    CALL RESULT
    RET    
C20 ENDM


C21 PROC 
    PRINT 'Temp in R: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    sub ax, 492
    mov bx, 5
    mul BX
    mov bx, 9
    div bx
    PRINTN
    PRINT 'Temp in C: '
    CALL RESULT
    RET    
C21 ENDM


C22 PROC 
    PRINT 'BDT: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 86
    DIV BX
    PRINTN
    PRINT 'USD: '
    CALL RESULT
    RET    
C22 ENDM


C23 PROC 
    PRINT 'USD: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 86
    MUL BX
    PRINTN
    PRINT 'BDT: '
    CALL RESULT
    RET    
C23 ENDM


C24 PROC 
    PRINT 'BDT: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 96
    DIV BX
    PRINTN
    PRINT 'EU: '
    CALL RESULT
    RET    
C24 ENDM


C25 PROC 
    PRINT 'EU: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 96
    MUL BX 
    PRINTN
    PRINT 'BDT: '
    CALL RESULT
    RET    
C25 ENDM


C26 PROC 
    PRINT 'BDT: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 100
    MUL BX
    MOV BX, 122
    DIV BX
    PRINTN
    PRINT 'INR: '
    CALL RESULT
    RET    
C26 ENDM


C27 PROC 
    PRINT 'INR: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 122
    MUL BX
    MOV BX, 100
    DIV BX
    PRINTN
    PRINT 'BDT: '
    CALL RESULT
    RET    
C27 ENDM

C28 PROC 
    PRINT 'BDT: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 65
    MUL BX
    PRINTN
    PRINT 'CNR: '
    CALL RESULT
    RET    
C28 ENDM

C29 PROC 
    PRINT 'CNR: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 65
    DIV BX
    PRINTN
    PRINT 'BDT: '
    CALL RESULT
    RET    
C29 ENDM

C30 PROC 
    PRINT 'KMPH: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 621
    MUL BX
    MOV BX, 1000
    DIV BX
    PRINTN
    PRINT 'MPH: '
    CALL RESULT
    RET    
C30 ENDM

C31 PROC 
    PRINT 'MPH: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 161
    MUL BX
    MOV BX, 100
    DIV BX
    PRINTN
    PRINT 'KMPH: '
    CALL RESULT
    RET    
C31 ENDM

C32 PROC 
    PRINT 'KMPH: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 36
    DIV BX
    MOV BX, 10
    MUL BX
    PRINTN
    PRINT 'm/s: '
    CALL RESULT
    RET    
C32 ENDM

C33 PROC 
    PRINT 'm/s: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 36
    MUL BX
    MOV BX, 10
    DIV BX
    PRINTN
    PRINT 'KMPH: '
    CALL RESULT
    RET    
C33 ENDM

C34 PROC 
    PRINT 'm/s: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 321
    MUL BX
    MOV BX, 100
    DIV BX
    PRINTN
    PRINT 'Ft/s: '
    CALL RESULT
    RET    
C34 ENDM

C35 PROC 
    PRINT 'Ft/s: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 100
    MUL BX
    MOV BX, 321
    DIV BX
    PRINTN
    PRINT 'm/s: '
    CALL RESULT
    RET    
C35 ENDM

C36 PROC 
    PRINT 'Ounce: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 283
    MUL BX
    MOV BX, 10
    DIV BX
    PRINTN
    PRINT 'Gram: '
    CALL RESULT
    RET    
C36 ENDM

C37 PROC 
    PRINT 'Gram: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 10
    MUL BX
    MOV BX, 283
    DIV BX
    PRINTN
    PRINT 'Ounce: '
    CALL RESULT
    RET    
C37 ENDM

C38 PROC 
    PRINT 'KG: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 22
    MUL BX
    MOV BX, 10
    DIV BX
    PRINTN
    PRINT 'LB: '
    CALL RESULT
    RET    
C38 ENDM

C39 PROC 
    PRINT 'LB: '
    CALL SCAN_NUM 
    MOV AX, CX
    MOV CH, BH
    MOV CL, BL
    MOV BX, 10
    MUL BX
    MOV BX, 22
    MUL BX
    PRINTN
    PRINT 'KG: '
    CALL RESULT
    RET    
C39 ENDM
    DEFINE_SCAN_NUM
    DEFINE_PRINT_NUM
    DEFINE_PRINT_NUM_UNS
END