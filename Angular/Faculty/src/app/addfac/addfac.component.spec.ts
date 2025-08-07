import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddfacComponent } from './addfac.component';

describe('AddfacComponent', () => {
  let component: AddfacComponent;
  let fixture: ComponentFixture<AddfacComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddfacComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddfacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
